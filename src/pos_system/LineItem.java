

package pos_system;

/**
 *
 * @author Alex
 */
public class LineItem {
    
    private Product product;
    DiscountStrategy ds;
    
    public LineItem(Product product){
        setProduct(product);
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    
    public String getProductInfo(){
        return product.getProductInfo();
    }
    
//    public String getProductDescription() {
//        return product.getProductDescription();
//    }
//    
//    public String getProductID(){
//        return product.getProductID();
//    }
//    
//    public double getProductPrice(){
//        return product.getProductPrice();
//    }
//    
//    public double getAmountSaved(){
//        return ds.getSavedAmount(product.getProductPrice(), 5);
//    }
//    
//    public double getTotalAfterDiscount(){
//        return ds.getTotalAfterDiscountedRate(product.getProductPrice(), 5);
//    }
    
    public static void main(String[] args) {
        Product RcCar = new Product("RC Car", "A101", 10.99, new DiscountByPercent(.1));
        LineItem l = new LineItem( RcCar );
        
        System.out.println(RcCar.getProductInfo());
    }
}
