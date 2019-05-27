package com.example.RentACar;

import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
public class CarController {

    private Inventory carList = new Inventory();

    // Hämtar alla bilar
    @RequestMapping(value = "/car", method = GET)
    public ArrayList<Car> allCars(@RequestParam(value = "search", defaultValue = "") String search) {
        return carList.getCars(search);
    }

    // Hämtar en viss bil med id
    @RequestMapping(value = "/car/{id}", method = GET)
    public Car getCar(@PathVariable("id") String id) {
        Car car = carList.getCarById(id);
        return car;
    }

    // Lägger till en bil
    @RequestMapping(value = "/car", method = POST)
    public Car addCar(@RequestBody Car car) {
        carList.addCar(car);
        return car;
    }

    // Tar bort en viss bil med id
    @RequestMapping(value = "/car/{id}", method = DELETE)
    public ArrayList<Car> removeCarById(@PathVariable("id") String id) {
        carList.removeCar(id);
        return carList.getCars("");
    }

    // Hämtar en viss bils bokningsstatus med id
    @RequestMapping(value = "/car/{id}/bookings", method = GET)
    public boolean getBookings(@PathVariable("id") String id) {
        boolean booking = carList.getBooking(id);
        return booking;
    }

    // Bokar en viss bil med id
    @RequestMapping(value = "/car/{id}/bookings", method = POST)
    public Car bookCar(@PathVariable("id") String id) {
        Car car = carList.getCarById(id);
        car.setBooked(true);
        return car;
    }

    // Avbokar en viss bil med id
    @RequestMapping(value = "/car/{id}/bookings", method = DELETE)
    public Car deleteBooking(@PathVariable("id") String id) {
        Car car = carList.getCarById(id);
        car.setBooked(false);
        return car;
    }
}
