package com.jap.course3;
public class VehicleService {
    // Step 17: Declare the main method
    public static void main(String[] args) {
        // Step 17a: Create object of Bike class
        Bike bike = new Bike("Yamaha", "YZF", "sportsBike");

        // Step 17b: Call maxSpeed() method and print the int value returned by the method
        System.out.println("Bike Max Speed: " + bike.maxSpeed("sportsBike") + " km/h");

        // Step 17c: Call getManufacturerInformation() method and print the String value returned by the method
        System.out.println(bike.getManufacturerInformation());

        // Step 18: Sample Output for Car Object
        Car car = new Car("Santro", "Santro123", "sedan");
        System.out.println("Car type is " + car.getVehicleType() + " its speed is " + car.maxSpeed("sedan") + " km/h");
        System.out.println(car.getManufacturerInformation());
    }
}
