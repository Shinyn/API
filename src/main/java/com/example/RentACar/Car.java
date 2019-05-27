package com.example.RentACar;

public class Car {

    String model;
    String id;
    int price;
    boolean isBooked;



    public Car(String model, String id, int price, boolean isBooked) {
        this.model = model;
        this.id = id;
        this.price = price;
        this.isBooked = isBooked;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        this.isBooked = booked;
    }
}
