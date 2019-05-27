package com.example.RentACar;

import java.util.ArrayList;

public class Inventory {

    ArrayList<Car> carList;

    public Inventory() {
        this.carList = new ArrayList<>();
        addTestCars();
    }

    public void removeCar(String id) {
        Car car = getCarById(id);
        carList.remove(car);
    }

    public boolean getBooking(String id) {
        Car car = getCarById(id);
        if (car.isBooked()) {
            return car.isBooked;
        }

        return false;
    }

    public ArrayList<Car> getCars(String search) {
        if (search.equals("")) {
            return carList;
        }

        ArrayList<Car> carItem = new ArrayList<>();
            for (Car car : carList) {
                if(car.getModel().toLowerCase().contains(search.toLowerCase())) {
                    carItem.add(car);
                }
            }
            return carItem;
    }

    public Car getCarById(String id) {
        for (Car car : carList) {
            if(car.getId().equals(id)) {
                return car;
            }
        }
        return null;
    }

    public void addCar(Car car) {
        carList.add(car);
    }

    public void addTestCars() {
        Car car1 = new Car("Saab", "0", 400, true);
        Car car2 = new Car("Nissan", "1", 800, false);
        Car car3 = new Car("Passat", "2", 250, true);
        Car car4 = new Car("Bentley", "3", 24000, true);

        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
    }













}
