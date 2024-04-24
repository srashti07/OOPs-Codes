package com.jap.course3;

class Car extends VehicleManufacturer implements Vehicle {
    // Step 12: Create parameterized constructor
    public Car(String vehicleName, String vehicleModelName, String vehicleType) {
        super(vehicleName, vehicleModelName, vehicleType);
    }

    // Step 13: Override maxSpeed() method
    @Override
    public int maxSpeed(String vehicleType) {
        if (vehicleType.equals("sportsCar")) {
            return 250;
        } else if (vehicleType.equals("sedan")) {
            return 170;
        } else {
            return 0;
        }
    }

    // Step 14: Override getManufacturerInformation() method
    @Override
    public String getManufacturerInformation() {
        return "Car (Manufacturer name: '" + getVehicleName() + "', Model Name: '" + getVehicleModelName() + "', Type: '" + getVehicleType() + "')";
    }
}
