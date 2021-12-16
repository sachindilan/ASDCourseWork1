package com.attraction;

public class Ticket {

    private Double price;

    public Ticket(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "price=" + price +
                '}';
    }
}
