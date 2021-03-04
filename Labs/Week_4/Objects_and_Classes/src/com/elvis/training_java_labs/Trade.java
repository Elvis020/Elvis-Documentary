package com.elvis.training_java_labs;

public class Trade {
    protected String ID;
    protected String Symbol;
    protected int quantity;
    protected double price;

    public Trade(String ID, String symbol, int quantity, double price) {
        this.ID = ID;
        Symbol = symbol;
        this.quantity = quantity;
        this.price = price;
    }

    public Trade(String ID, String symbol, int quantity) {
        this.ID = ID;
        Symbol = symbol;
        this.quantity = quantity;
    }


    @Override
    public String toString() {
        return "Trade{" +
                "ID='" + ID + '\'' +
                ", Symbol='" + Symbol + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

    public void setPrice(double price) {
        if(price >= 0)
            this.price = price;
        else
            this.price = 0.0;
            System.out.println("Price cannot be negative");
    }
}
