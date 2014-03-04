
package pos_system;

/**
 *
 * @author Alex
 */
public class ProductDatabase {

    private Product product;
    private String prodcutData;

    public ProductDatabase(Product p) {
        setProduct(p);
    }
    
    public void setProduct(Product p){
        this.product = p;
    }
    
    
   


    















//private Product product;
    private String [] products;
//    public Product getProduct() {
//        return product;
//    }
//
//    public void setProduct(Product product) {
//        this.product = product;
//    }
    
    
//    public final Product findProduct(final String prodId) {
//        Product product = null;
//        // validation is needed for method parameter
//        if (prodId == null || prodId.length() == 0) {
//            System.out.println("Sorry, FakeDatabase.findProduct method has "
//                    + "illegal argument");
//        } else {
//            for (Product p : product) {
//                if (prodId.equals(p.getProductID())) {
//                    product = p;
//                    break;
//                }
//            }
//        }
//
//        return product;
//    }
    
    
}
