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
public class LineItem {
    
    private Product product;
    private String itemInfo;
    private double total = product.getProductPrice();
    
    public LineItem(Product p, String info){
        this.product = p;
        this.itemInfo = info;
    }
    
    public void setProduct(Product p){
        this.product = p;
    }
    
    public void setItemInfo(String info){
        this.itemInfo = info;
    }
                     
    
    
}
