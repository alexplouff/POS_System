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
public class start {
    
    public static void main(String[] args) {
        
        DiscountByPercent percent = new DiscountByPercent(10.00, 10.00, .05);
        DiscountByQuantity quantity = new DiscountByQuantity(10.00, 10.00);
        
        System.out.println(percent.getTotalAfterDiscountedRate());
        System.out.println(percent.getSavedAmount());
        percent.getTotalAfterDiscountedRate();
        percent.getSavedAmount();
    }
}
