package com.pk.defaultmethod;

/**
 *
 * @author Oscar Blancarte <oscarblancarte3@gmail.com>
 */
public class Main {
    public static void main(String[] args) {
        SalesOrder order = new SalesOrder();
        
        for(int c = 0; c<10; c++){
            SalesOrderItem item = new SalesOrderItem("Product " + c, 100, 10);
            order.addItem(item);
        }
        
        System.out.println(order.getPrice());
    }
}
