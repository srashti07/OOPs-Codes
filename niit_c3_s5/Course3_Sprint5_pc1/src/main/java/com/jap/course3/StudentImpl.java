package com.jap.course3;
public class StudentImpl {
    public static void main(String[] args) {
        // Declare and initialize objects of the StudentMarks class
        StudentMarks studentMarks = new StudentMarks();

        // Call the overloaded calculateMarks() methods and pass the respective parameters
        int medicalPathwayTotal = studentMarks.calculateMarksOfMedical(80, 85, 90, 95);
        int nonMedicalPathwayTotal = studentMarks.calculateMarksOfNonMedical(75, 88, 92);
        int businessPathwayTotal = studentMarks.calculateMarksOfBusiness(90, 85, 95);

        // Display the values returned from the calculateMarks() methods
        System.out.println("Total Marks for Medical Pathway: " + medicalPathwayTotal);
        System.out.println("Total Marks for Non-Medical Pathway: " + nonMedicalPathwayTotal);
        System.out.println("Total Marks for Business Pathway: " + businessPathwayTotal);
    }
}