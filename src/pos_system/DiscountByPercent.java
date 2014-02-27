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
public class DiscountByPercent implements DiscountStrategy {
    
    private double discountPercent;
    private double quantity;
    private double price;
    private double percent;
    
    public DiscountByPercent(double quantity, double price, double discountPercent){
        setQuantity(quantity);
        setPrice(price);
        setDiscountPercent(discountPercent);
    }
    
    public void setDiscountPercent(double discountPercent){
        
        this.discountPercent = discountPercent;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
     public double getPercent() {
        return discountPercent;
    }
    
    @Override
    public double getSavedAmount(){
            
        return getQuantity() * getPrice() * getPercent();
    }
    
    @Override
    public double getTotalAfterDiscountedRate(){
        
        return getQuantity() * getPrice() - getSavedAmount();
    }
    
    public static void main(String[] args) {
        DiscountByPercent percent = new DiscountByPercent(5, 10, .05);
        System.out.println(percent.getTotalAfterDiscountedRate());
    }

}
