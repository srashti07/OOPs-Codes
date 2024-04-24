package com.jap.course3;

public class VoterImpl {
    public static void main(String[] args) {
        Voter Nikhil = new Voter();
        Nikhil.setName("Nikhil");
        Nikhil.setAge(10);
        System.out.println(Nikhil.getAgeCriteria());

    }
}