package com.jap.course3;
public class TransmissionTest {
    public static void main(String[] args) {
        // Test ManualTransmission
        ManualTransmission manual = new ManualTransmission("MT123", 6);
        manual.showSpecs();
        System.out.println();

        // Test AutomatedManualTransmission
        double[] amTDRatios = { 3.500, 2.000, 1.400, 1.000, 0.700 };
        AutomatedManualTransmission amt = new AutomatedManualTransmission("AMT456", 5, amTDRatios);
        amt.showSpecs();
    }
}