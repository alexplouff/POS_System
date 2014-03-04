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

    @Override
    public String toString() {
        return "Product description: " + description + " ProductID: " + productID + " ProductPrice: " + productPrice + " DiscountStrategy: " + discountStrategy.getTotalAfterDiscountedRate(10.00, 5);
    }
    
    public static void main(String[] args) {
        Product p = new Product("RC CAR", "RC CAR", 10.00, new DiscountByPercent(.1));
        System.out.println(p.toString());
        System.out.println(p.getProductPrice());
    }
}
