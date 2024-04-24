package com.jap.course3;
class ManualTransmission extends Transmission {
    private int numForwardGears;
    public ManualTransmission(String modelNumber, int numForwardGears) {
        super("Manual", modelNumber);
        this.numForwardGears = numForwardGears;
    }

    @Override
    public void showSpecs() {
        super.showSpecs();
        System.out.println("1. Number of Forward Gears: " + numForwardGears);
    }
}