package com.jap.course3;
abstract class VehicleManufacturer {
    private String vehicleName;
    private String vehicleModelName;
    private String vehicleType;

    // Step 3: Create default constructor
    public VehicleManufacturer() {
    }

    // Step 3: Create parameterized constructor
    public VehicleManufacturer(String vehicleName, String vehicleModelName, String vehicleType) {
        this.vehicleName = vehicleName;
        this.vehicleModelName = vehicleModelName;
        this.vehicleType = vehicleType;
    }

    // Step 4: Declare getters and setters
    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getVehicleModelName() {
        return vehicleModelName;
    }

    public void setVehicleModelName(String vehicleModelName) {
        this.vehicleModelName = vehicleModelName;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    // Step 5: Define abstract method
    public abstract String getManufacturerInformation();
}

// Step 6: Declare Vehicle interface
interface Vehicle {
    int maxSpeed(String vehicleType);
}
