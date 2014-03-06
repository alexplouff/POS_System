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
    
    private String productDescription;
    private String productID;
    private double productPrice;
    private DiscountStrategy discountStrategy;

    public Product(String description, String productID, double productPrice, DiscountStrategy discountStrategy) {
        setProductDescription(description);
        setProductID(productID);
        setProductPrice(productPrice);
        setDiscountStrategy(discountStrategy);
    }
    
    public void setProductDescription(String description) {
        this.productDescription = description;
    }
    
    public String getProductDescription() {
        return productDescription;
    }
    
    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductID() {
        return productID;
    }
    
    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public double getProductPrice() {
        return productPrice;
    }
    
    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }
    
    public DiscountStrategy getDiscount(){
        return discountStrategy;
    }
    
    public double getDiscountByPercent(double qty) {
        return discountStrategy.getTotalAfterDiscountedRate(productPrice, qty);
    }
    
    public double getDiscountByQty(double qty){
        return discountStrategy.getSavedAmount(productPrice, qty);
    }
    
    public String getProductInfo(){
        return productDescription + " " + productID + " " + productPrice;
    }
    
    public String getProductInfoWithDiscountedTotal(double qty){
        return getProductInfo() + discountStrategy.getTotalAfterDiscountedRate(productPrice, qty);
    }
    
    public static void main(String[] args) {
        Product p = new Product("RcCAR", "A101", 10.00, new DiscountByPercent(.1));
        System.out.println(p.getProductInfoWithDiscountedTotal(5));
        
        
    }
}
