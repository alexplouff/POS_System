/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pos_system;
import javax.swing.JOptionPane;
/**
 *
 * @author Alex
 */
public class DiscountByQuantity implements DiscountStrategy{
    
    private double quantity;
    private double discountQtyTerm = 2;
    private double discount;
    private double price;
    
    public DiscountByQuantity(double quantity, double price){
        this.setPrice(price);
        this.setQuantity(quantity);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }    
    
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }
    
    public void setQuantity(double quantity) {
        
        this.quantity = quantity;
    }
    
    public double getQuantity() {
        return quantity;
    }

    @Override
    public double getTotalAfterDiscountedRate(){
        double total = 0;  
 
        total = this.getPrice() * this.getQuantity() - getSavedAmount();
        
        return total ;
    }
    
    public double getSavedAmount(){
        return this.getPrice() * this.getQuantity() * this.getDiscount();
    }
    
}
