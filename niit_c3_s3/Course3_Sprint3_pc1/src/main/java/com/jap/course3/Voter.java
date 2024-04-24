package com.jap.course3;

public class Voter {
    private String name;
    private int age;

    static final int VOTER_ELIGIBLE_AGE = 18;
    public void Voter(){

    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getAgeCriteria() {
        if (age >= VOTER_ELIGIBLE_AGE) {
            return name + " Is Eligible to vote";
        }
        else if (age > 0) {
            return name + " Is Not Eligible to vote";
        }
        else {
            return "Age can't be Negative or Zero";
        }
    }

}