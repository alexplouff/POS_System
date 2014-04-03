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
    
    private static final String SPACE = " ";
    
    private String productDescription;
    private String productID;
    private double productPrice;
    private DiscountStrategy discountStrategy;

    public Product(String productID, String description, double productPrice, DiscountStrategy discountStrategy) {
        setProductID(productID);
        setProductDescription(description);
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
        return discountStrategy.getTotalAfterDiscount(productPrice, qty);
    }
    
    public double getDiscountByQty(double qty){
        return discountStrategy.getSavedAmount(productPrice, qty);
    }
    
    public String getProductInfo(){
        return productDescription + " " + productID + " " + productPrice;
    }
    
    public String getProductInfoWithDiscountedTotal(double qty){
        return "Product ID: " + getProductID() + SPACE + getProductDescription() +
                 " \nPrice: " + getProductPrice() +
                "\n" + "Total After Discount: " + 
                discountStrategy.getTotalAfterDiscount(productPrice, qty);
    }
    
    public static void main(String[] args) {
        Product p = new Product("A101", "RcCAR", 20.00, new DiscountByPercent(.1));
        System.out.println(p.getProductInfoWithDiscountedTotal(1));
        
        
    }
}
