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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CashRegister register = new CashRegister();
        
        try{
        register.startSale("Cust101");
        register.addItem("A101", 2);
        register.addItem("B101", 1);
        register.getTotal();
        } catch( IllegalArgumentException iae){
            iae.getMessage();
        }
    }
    
}
