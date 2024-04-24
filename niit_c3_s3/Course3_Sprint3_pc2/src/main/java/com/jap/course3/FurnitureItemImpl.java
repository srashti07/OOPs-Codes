package com.jap.course3;

public class FurnitureItemImpl {
    public static void main(String[] args) {
        //creating an instance of a class
        FurnitureItem furniture = new FurnitureItem();


        //set the values using setter method for item1
        furniture.setFurnitureCode(2811);
        furniture.setFurnitureType("dining");
        furniture.setGradeOfFurniture("grade1");
        furniture.setFurnitureUsage("outdoor");
        furniture.setPrice(3000.05f);



        //calling calculateDiscount() and store it in discountPrice variable
        float discountPriceForItem1 = furniture.calculateDiscount();
        furniture.displayDetails();
        System.out.println();

    }
}