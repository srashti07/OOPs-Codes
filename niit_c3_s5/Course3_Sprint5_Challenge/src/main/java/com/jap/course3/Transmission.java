package com.jap.course3;
public class Transmission {
    private String transmissionType;
    private String modelNumber;

    public Transmission(String transmissionType, String modelNumber) {
        this.transmissionType = transmissionType;
        this.modelNumber = modelNumber;
    }

    public void showSpecs() {
        System.out.println("Transmission Type: " + transmissionType);
        System.out.println("Transmission Model Number: " + modelNumber);
        System.out.println("\nKey Specifications:");

        // Additional specifications can be added based on the specific type of transmission
    }
}
