package com.pk.defaultmethod;

import java.util.List;

/**
 * @author Oscar Blancarte <oscarblancarte3@gmail.com>
 */
public interface IOrder {
    
    public List<IOrderItem> getItems();
    public void setItems(List<IOrderItem> items);
    
    public default double getPrice(){
        List<IOrderItem> items = getItems();
        double totalPrice = 0;
        for (IOrderItem item : items) {
            totalPrice += item.getTotal();
        }
        return totalPrice;
    }
    
}
