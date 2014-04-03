

package pos_system;

/**
 *
 * @author Alex
 */
public class Receipt {
    private StorageStrategy storage;
    private Customer customer;
    private LineItem[] lineItems;
    
    
    Receipt(String custID, StorageStrategy storage){
        lineItems = new LineItem[0];
        this.storage = storage;
        
        customer = storage.findCustomer(custID);
        //System.out.println(customer.getCustomerName());
    }

    public StorageStrategy getStorage() {
        return storage;
    }

    public void setStorage(StorageStrategy storage) {
        this.storage = storage;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LineItem[] getLineItems() {
        return lineItems;
    }

    public void setLineItems(LineItem[] lineItems) {
        this.lineItems = lineItems;
    }
    
    
    public void addItemToOrder(String prodId, double qty) {
        Product product = storage.findProduct(prodId);
        LineItem item = new LineItem(product,qty);
        addToArray(item);
    }
    
    private void addToArray(final LineItem item) {
        
        // needs validation
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = item;
        lineItems = tempItems;
    }  
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (LineItem item : lineItems) {
            sb.append(item).append('\n');
        }
        return sb.toString();
    }
}
