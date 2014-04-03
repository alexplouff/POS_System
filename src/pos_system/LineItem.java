

package pos_system;

/**
 *
 * @author Alex
 */
public class LineItem {
    
    private Product product;
    private double qty;
    
    
    public LineItem(Product product, double qty){
        setProduct(product);
        setQty(qty);
    }

    public final void setQty(double qty) {
        this.qty = qty;
    }

    public double getQty() {
        return qty;
    }
 
    public final void setProduct(Product product) {
        this.product = product;
    }
    
    public String getProductDescription() {
        return product.getProductDescription();
    }
    
    public String getProductID() {
        return product.getProductID();
    }
    
    public double getProductPrice(){
        return product.getProductPrice();
    }
    
    public double getAmountSaved(){
        return product.getDiscount().getSavedAmount(product.getProductPrice(), 5);
    }
    
    public double getTotalAfterDiscount(){
        return product.getDiscount().getTotalAfterDiscount(product.getProductPrice(), 5);
    }
    
    public double getSubtotal(){
        return product.getProductPrice() * qty;
    }
    
    @Override
    public String toString() {
        final String SPACE = " ";
        return "Product ID: " + this.getProductID() + SPACE + this.getProductDescription() +
                "\n" + this.getProductPrice() + "Quantity: " + this.getQty() +
                "\nSubTotal: " + getSubtotal() + 
                "\nAmountSaved: " + this.getAmountSaved();
    }
    
    public static void main(String[] args) {
        Product RcCar = new Product("RC Car", "A101", 10.99, new DiscountByPercent(.1));
        LineItem l = new LineItem( RcCar, 2 );
        System.out.println(l);
        System.out.println("");
        
    } }

