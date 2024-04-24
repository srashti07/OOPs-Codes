package com.jap.course3;

public class FurnitureItem {
    private int furnitureCode;
    private String furnitureType;
    private String gradeOfFurniture;
    private String furnitureUsage;
    private float price;
    //declaring static and final int variable
    public static final int DISCOUNT = 5;

    //defining no argument constructor
    public FurnitureItem() {
    }
    //creating getters and setters

    public int getFurnitureCode() {
        return furnitureCode;
    }

    public void setFurnitureCode(int furnitureCode) {

        this.furnitureCode = furnitureCode;
    }

    public String getFurnitureType() {

        return furnitureType;
    }

    public void setFurnitureType(String furnitureType) {

        this.furnitureType = furnitureType;
    }

    public String getGradeOfFurniture() {

        return gradeOfFurniture;
    }

    public void setGradeOfFurniture(String gradeOfFurniture) {
        this.gradeOfFurniture = gradeOfFurniture;
    }

    public String getFurnitureUsage() {

        return furnitureUsage;
    }

    public void setFurnitureUsage(String furnitureUsage) {

        this.furnitureUsage = furnitureUsage;
    }

    public float getPrice() {

        return price;
    }

    public void setPrice(float price) {

        this.price = price;
    }
    public float calculateDiscount(){
        if(gradeOfFurniture.equals("grade1") && furnitureUsage.equals( "outdoor")){
            float discount = price * (DISCOUNT/100.0f);
            return price-discount;
        }
        return 0.0f;
    }
    public void displayDetails(){
        System.out.println("Furniture Code   :\t"+furnitureCode);
        System.out.println("Furniture Type   :\t"+furnitureType);
        System.out.println("Furniture Grade  :\t"+gradeOfFurniture);
        System.out.println("Furniture Usage  :\t"+furnitureUsage);
        System.out.println("Total Price      :\t$"+price);
        System.out.println("Discounted Price :\t$" + calculateDiscount());
    }
}