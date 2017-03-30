package com.pk.defaultmethod;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Oscar Blancarte <oscarblancarte3@gmail.com>
 */
public class SalesOrder implements IOrder {
    
    private List<IOrderItem> items = new ArrayList<>();
    
    @Override
    public List<IOrderItem> getItems() {
        return items;
    }

    @Override
    public void setItems(List<IOrderItem> items) {
        this.items = items;
    }
    
    public void addItem(IOrderItem item){
        items.add(item);
    }

    @Override
    public double getPrice() {
        return 1.1d;
    }
}
