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
    private double grandTotal;
    private String thisLineItem;

    public LineItem(String thisLineItem) {
      
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getThisLineItem() {
        return product.getProductInfo();
    }

    public void setThisLineItem(String thisLineItem) {
        this.thisLineItem = thisLineItem;
    }
    
    public static void main(String[] args) {
        LineItem l = new LineItem();
    }
    
    
    
    
                  
    
    
}
