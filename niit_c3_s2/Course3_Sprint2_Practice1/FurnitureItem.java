public class FurnitureItem {
    int furnitureCode;
    String furnitureType;
    int gradeOfFurniture;
    String color ;
    String furnitureUsage;
    double price;
    // No-argument constructor
    public FurnitureItem(){
        furnitureCode = 0;
        furnitureType = "Unknown";
        gradeOfFurniture = 0;
        color = "Unknown";
        furnitureUsage = "Indoor";
        price = 0.0;
    }
    //Parameterized constructor
    public FurnitureItem(int furnitureCode,String furnitureType,int gradeOfFurniture,String color,String furnitureUsage,double price)
    {
        this.furnitureCode = furnitureCode;
        this.furnitureType = furnitureType;
        this.gradeOfFurniture = gradeOfFurniture;
        this.color = color;
        this.furnitureUsage = furnitureUsage;
        this.price = price;
    }
    //Method to calculate the discount price
    public double calculateDiscountPrice(){
        double discount = 0.05;
        if (furnitureUsage.equalsIgnoreCase(("Outdoor"))) {
            return price * (1 - discount);
        }
        else{
            return price;
        }

    }
}