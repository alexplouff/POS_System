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
public interface DiscountStrategy {
    
    public abstract double getTotalAfterDiscountedRate();
    
    public abstract double getSavedAmount();
}
