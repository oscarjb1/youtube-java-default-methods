package com.pk.defaultmethod;

/**
 * @author Oscar Blancarte <oscarblancarte3@gmail.com>
 */
public interface IOrderItem {

    public  double getPrice();
    public double getIsr();
    public void setIsr(double isr);
    public void setPrice(double price);
    public String getName();
    public void setName(String name);
    
    public default double getTotal(){
        return getPrice() + getIsr();
    }
}
