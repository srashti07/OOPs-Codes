package com.jap.course3;
public class EngineImpl {
    public static void main(String[] args) {
        //creating instance for different engines
        PetrolEngine petrolEngine = new PetrolEngine("A-001", 6.0, 200, 6000, 4);
        DieselEngine dieselEngine = new DieselEngine("D-001", 5.0, 350, 8000, 6);
        CNGEngine cngEngine = new CNGEngine("B-001", 2.5, 300, 5500, 4);
        ElectricEngine electricEngine = new ElectricEngine("L-001", 0.0, 350, 9000, 0);

        //set voltage using setter method
        double voltage =  electricEngine.setVoltage(600);
        //Displaying details of different engine types
        System.out.println("Petrol Engine Details:");
        petrolEngine.displayDetails();
        System.out.println();

        System.out.println("Diesel Engine Details:");
        dieselEngine.displayDetails();
        System.out.println();

        System.out.println("CNG Engine Details:");
        cngEngine.displayDetails();
        System.out.println();

        System.out.println("Electric Engine Details:");
        electricEngine.displayDetails();
        System.out.println("Voltage             :\t" + voltage );
    }
}