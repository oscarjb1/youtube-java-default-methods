package com.pk.defaultmethod;

/**
 * @author Oscar Blancarte <oscarblancarte3@gmail.com>
 */
public class SalesOrderItem implements IOrderItem {
    private String name;
    private double price;
    private double isr;

    public SalesOrderItem(String name, double price,double isr) {
        this.name = name;
        this.price = price;
        this.isr = isr;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    public double getIsr() {
        return isr;
    }

    public void setIsr(double isr) {
        this.isr = isr;
    }
}
