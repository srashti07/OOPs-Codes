package com.jap.course3;
class AutomatedManualTransmission extends Transmission {
    private int numForwardGears;
    private double[] gearRatios;

    public AutomatedManualTransmission(String modelNumber, int numForwardGears, double[] gearRatios) {
        super("Automated Manual", modelNumber);
        this.numForwardGears = numForwardGears;
        this.gearRatios = gearRatios;
    }

    @Override
    public void showSpecs() {
        super.showSpecs();
        System.out.println("1. Number of Forward Gears: " + numForwardGears);

        for (int i = 0; i < gearRatios.length; i++) {
            System.out.println((i + 2) + ". " + (i + 1) + "st Gear Ratio: " + gearRatios[i]);
        }
    }
}