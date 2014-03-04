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
    
    
    private static String customer_Name;

    public Customer(String customerName) {
        setCustomerName(customerName);
    }
    
    public void setCustomerName(String customerName){
        this.customer_Name = customerName;
    }
    
    public String getCustomerName(){
        return customer_Name;
    }
    
    
}

