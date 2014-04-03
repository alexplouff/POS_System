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
public interface StorageStrategy {

    public abstract Customer findCustomer(final String customerID);

    public abstract Product findProduct(final String prodId);
    
}
