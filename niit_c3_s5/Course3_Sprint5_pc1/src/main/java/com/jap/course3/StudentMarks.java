package com.jap.course3;
public class StudentMarks {
    // Method for Medical pathway students
    public int calculateMarksOfMedical(int math, int physics, int chemistry, int biology) {
        int sum = math + physics + chemistry + biology;
        return sum;
    }
    // Method for Non-Medical pathway students
    public int calculateMarksOfNonMedical(int math, int physics, int chemistry) {
        int sum = math + physics + chemistry;
        return sum;
    }

    // Method for Business pathway students
    public int calculateMarksOfBusiness(int math, int economics, int accounts) {
        int sum = math + economics + accounts;
        return sum;
    }
}