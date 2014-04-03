/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos_system;

/**
 *
 * @author Alex
 */
public class CashRegister {

    private final StorageStrategy d = new ProductDatabase();
    private Receipt receipt;
    
    public CashRegister() {
       
    }

    public void startSale(String customerID) throws IllegalArgumentException {
        
        if ( customerID.equals("") || customerID.isEmpty() || customerID.length() != 4)
            throw new IllegalArgumentException( "CustomerID must Not Be Empty and Contain 4 Characters ");
        
        receipt = new Receipt(customerID, d);
    }
   

    public void addItem(String productID, double quantity) throws IllegalArgumentException {
            if( productID.equals("") || productID.isEmpty() || productID.length() != 4 )
                throw new IllegalArgumentException( "ProductID Must Not Be Empty and Contain 4 Characters ");
            
            if ( quantity == 0 )
                throw new IllegalArgumentException("Quantity Can Not Be 0");
        receipt.addItemToOrder(productID, quantity);
    }
    
    public void getTotal() {
        System.out.println(receipt);
    }
}
