package com.design.observer;

import java.util.ArrayList;

public class Order {

    double totalPrice;
    int count;
    int shippingCost;

    private ArrayList<OrderObserver> observers = new ArrayList<>();

    public Order(double totalPrice, int count) {
        this.totalPrice = totalPrice;
        this.count = count;
        this.shippingCost = 10;
    }

    public void attach(OrderObserver observer){
        observers.add(observer);
    }

    public void detach(OrderObserver observer){
        observers.remove(observer);
    }

    public void notifyObservers(Order order) {
        for(OrderObserver observer:observers) {
            observer.update(order);
        }
    }

    public double getTotalPrice(){
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice){
        this.totalPrice = totalPrice;
    }

    public int getCount(){
        return count;
    }

    public void setCount(int count){
        this.count = count;
    }

    public int getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(int shippingCost) {
        this.shippingCost = shippingCost;
    }

    public String toString(){
        return "Total Price: " + totalPrice + ", Count: " + count;
    }

}
