
package pos_system;

/**
 * 
 * @author Alex
 */
public class ProductDatabase {
   
    
    private Customer[] customers = {
    
       new Customer ( "Cust101", "Alex Plouff" ),
       new Customer ( "Cust102", "Sergei Palksinov"),
       new Customer ( "Cust103", "Mother Goose "),
       new Customer ( "Cust104", "Irritated Customer" )
    };
       
    public final Customer findCustomer(final String customerID) {
        Customer customer = null;
        // validation is needed for method parameter
        if (customerID == null || customerID.length() == 0) {
            System.out.println("Sorry, Customer not found");
        } else {
            for (Customer c : customers) {
                if (customerID.equals(c.getCustomerID())) {
                    customer = c;
                    break;
                }
            }
        }

        return customer;
    }   
    
    
    private final Product[] products = {
       new Product("A101", "RC Car", 19.99, new DiscountByPercent(.5)),
       new Product("B101", "Garbage", 69.99, new DiscountByQuantity(3)),
       new Product("C101", "Super Garbage", 89.99, new DiscountByPercent(.3)),
       new Product("D101", "Super Duper Garbage", 99.99, new DiscountByQuantity(5))  
    };
    
    
    
    public final Product findProduct(final String prodId) {
        Product product = null;
        // validation is needed for method parameter
        if (prodId == null || prodId.length() == 0) {
            System.out.println("Sorry, FakeDatabase.findProduct method has "
                    + "illegal argument");
        } else {
            for (Product p : products) {
                if (prodId.equals(p.getProductID())) {
                    product = p;
                    break;
                }
            }
        }

        return product;
    }
    
    //Nececessary ??? Need one for product??
    public Customer[] getCustomers() {
        return customers;
    }

    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }
    
    public static void main(String[] args) {
        ProductDatabase d = new ProductDatabase();
        System.out.println(d.findCustomer("Cust101"));
        System.out.println(d.getCustomers());
       // System.out.println(d.findProduct("A101"));
    }
}