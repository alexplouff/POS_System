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
public class DiscountByQuantity implements DiscountStrategy{
    
    private double discount;

    
    public DiscountByQuantity( double discount ){
        setDiscount(discount);
    }  
    
    public void setDiscount(double discount) {
       this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    @Override
    public double getTotalAfterDiscountedRate(double price, double qty){

        double totalBefore = price * qty;  
        
        double totalAfter = totalBefore - getSavedAmount(price, qty);
        
        return totalAfter ;
    
}
    
    @Override
    public double getSavedAmount(double price, double qty){
        return (price * qty) * getDiscount() ;
    }
    
    public static void main(String[] args) {
        DiscountStrategy d = new DiscountByQuantity(.10);
        
        System.out.println(d.getTotalAfterDiscountedRate(50.00, 5));
    }
}




