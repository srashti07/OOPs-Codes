package com.jap.course3;
class Bike extends VehicleManufacturer implements Vehicle {
    // Step 8: Create parameterized constructor
    public Bike(String vehicleName, String vehicleModelName, String vehicleType) {
        super(vehicleName, vehicleModelName, vehicleType);
    }

    // Step 9: Override maxSpeed() method
    @Override
    public int maxSpeed(String vehicleType) {
        if (vehicleType.equals("sportsBike")) {
            return 300;
        } else if (vehicleType.equals("cruiser")) {
            return 170;
        } else {
            return 0;
        }
    }

    // Step 10: Override getManufacturerInformation() method
    @Override
    public String getManufacturerInformation() {
        return "Bike (Manufacturer name: '" + getVehicleName() + "', Model Name: '" + getVehicleModelName() + "', Type: '" + getVehicleType() + "')";
    }
}
