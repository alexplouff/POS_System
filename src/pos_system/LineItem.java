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
    
    public LineItem(Product product){
        setProduct(product);
    }

    public String getProductDescription() {
        return product.getProductDescription();
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public DiscountStrategy getDiscountStrategy() {
        return discountStrategy;
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }
    
    
    
    public static void main(String[] args) {
        
    }
    
    
    
    
                  
    
    
}
