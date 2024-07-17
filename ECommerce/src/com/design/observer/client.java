package com.design.observer;

public class client {

    public static void main(String[] args) {

        PriceObserver priceObserver = new PriceObserver();
        QuantityObserver quantityObserver = new QuantityObserver();
        Order test = new Order(180, 6, 1);

        test.attach(priceObserver);
        test.attach(quantityObserver);

        System.out.println(test.toString());

        test.addItem(40);

        System.out.println(test.toString());
    }
}
