package com.jap.course3;
public class PetrolEngine extends Engine {
    //creating constructor using super keyword
    public PetrolEngine(String modelNo, double displacement, int maxPower, int maxRpm, int numOfCylinders) {
        super(modelNo, displacement, maxPower, maxRpm, numOfCylinders);
    }
}