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
public class Product {
    
    private String description;
    private String productID;
    private double productPrice;
    private DiscountStrategy discountStrategy;

    public Product(String description, String productID, double productPrice, DiscountStrategy discountStrategy) {
        setDescription(description);
        setProductID(productID);
        setProductPrice(productPrice);
        setDiscountStrategy(discountStrategy);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public double getDiscountByPercent() {
        return discountStrategy.getTotalAfterDiscountedRate(productPrice, productPrice);
    }
    
    public double getDiscountByQty(){
        return discountStrategy.getSavedAmount(productPrice, productPrice);
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }
    
    public static void main(String[] args) {
       
        Product product = new Product("RC Car", "A101", 10.00, new DiscountByPercent(.10));
        

    }
}
