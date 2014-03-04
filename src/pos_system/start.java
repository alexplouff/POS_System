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
        DiscountStrategy discount = new DiscountByPercent(.1);
        Product p = new Product("s", "s", 10, new DiscountByPercent(.1) );
        
    }
}
