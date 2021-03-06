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
    
    public DiscountByPercent( double discountPercent ){
        setDiscountPercent(discountPercent);
    }
    
    public void setDiscountPercent(double percent){
        this.discountPercent = percent;
    }
    
    public double getDiscountPercent(){
        return discountPercent;
    }
    
    @Override
    public double getSavedAmount(double price, double qty){
            
        return (qty * price) * getDiscountPercent();
    }
    
    @Override
    public double getTotalAfterDiscount(double price, double qty){
        
        return (qty * price) - getSavedAmount(price, qty);
    }    
    
    public static void main(String[] args) {
        DiscountByPercent d = new DiscountByPercent(.1);
        System.out.println(d.getTotalAfterDiscount(10, 2));
    }

}
