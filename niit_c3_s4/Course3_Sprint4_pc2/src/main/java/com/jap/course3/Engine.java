package com.jap.course3;
public class Engine {
    private String modelNo;
    private double displacement;
    private int maxPower;
    private int maxRpm;
    private int numOfCylinder;
    public Engine(String modelNo, double displacement, int maxPower, int maxRpm, int numOfCylinder){
        this.modelNo = modelNo;
        this.displacement = displacement;
        this.maxPower = maxPower;
        this.maxRpm = maxRpm;
        this.numOfCylinder = numOfCylinder;
    }
    //creating getter and setter
    public String getModelNo() {
        return modelNo;
    }
    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }
    public double getDisplacement() {
        return displacement;
    }
    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }
    public int getMaxPower() {
        return maxPower;
    }
    public void setMaxPower(int maxPower) {
        this.maxPower = maxPower;
    }
    public int getMaxRpm() {
        return maxRpm;
    }
    public void setMaxRpm(int maxRpm) {
        this.maxRpm = maxRpm;
    }
    public int getNumOfCylinder() {
        return numOfCylinder;
    }
    public void setNumOfCylinder(int numOfCylinder) {
        this.numOfCylinder = numOfCylinder;
    }
    public void displayDetails(){
        System.out.println("-------------------------------------------------");
        System.out.println("Model No            :\t" + getModelNo());
        System.out.println("Displacement        :\t" + getDisplacement());
        System.out.println("Max Power           :\t" + getMaxPower());
        System.out.println("Max RPM             :\t" + getMaxRpm());
        System.out.println("Number of Cylinders :\t" + getNumOfCylinder());
    }
}