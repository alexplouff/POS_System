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
public class ReceiptFormatOne implements ReceiptStrategy{
    
    LineItem li;
    
    ReceiptFormatOne(LineItem li){
        setReceiptLineItem(li);
    }
    
    private LineItem[] lineItems;
    private void addToArray(final LineItem item) {
        // needs validation
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = item;
        lineItems = tempItems;
    }
    
    
    public void setReceiptLineItem(LineItem li){
        
        
        this.li = li;
    }
    
    public LineItem getNextLineITem(){
        return li;
    }
    
    public static void main(String[] args) {
        Product RcCar = new Product("RC Car", "A101", 10.99, new DiscountByPercent(.1));
        LineItem l = new LineItem( RcCar, 2 );
        ReceiptFormatOne r = new ReceiptFormatOne(l);
        System.out.println(r.getNextLineITem());
    }
}
