package com.jap.course3;
//child class
public class ElectricEngine extends Engine{
    private double voltage;
    //creating constructor using super keyword
    public ElectricEngine(String modelNo,double displacement,int maxPower,int maxRpm,int numOfCylinders){
        super(modelNo, displacement, maxPower, maxRpm, numOfCylinders);
        this.voltage=voltage;
    }
    //creating getters for local variable voltage
    public double getVoltage() {
        return voltage;
    }
    public double setVoltage(double voltage) {
        this.voltage = voltage;
        return voltage;
    }
}