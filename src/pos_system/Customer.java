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
public class Customer {
    
    
    private String customerName;
    private String customerID;
    
    

    public Customer(String customerID, String customerName) {
        setCustomerID(customerID);
        setCustomerName(customerName);
    }
    
    public final void setCustomerID(String customerID){
        this.customerID = customerID;
    }    
    
    public final String getCustomerID(){
        return customerID;
    }
    public final void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    
    public final String getCustomerName(){
        return customerName;
    }
    
    
}

