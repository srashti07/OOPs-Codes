public class FurnitureItemImpl{
    public static void main(String[]args){
        //declare and initialize objects of the furniture item class
        FurnitureItem item1 = new FurnitureItem(101,"Table",2,"Red","Outdoor",500.0);
        FurnitureItem item2 = new FurnitureItem(102,"chair",1,"green","Indoor",450);
        FurnitureItem item3 = new FurnitureItem(103,"sofa",3,"Brown","Indoor",25000.0);
        FurnitureItem item4 = new FurnitureItem(104,"Bed",1,"white","Outdoor",20000.0);
        //Display the value of the variables for each object

        System.out.println("Item 1: "+item1.furnitureType+", Price: $"+ item1.calculateDiscountPrice());
        System.out.println("Item 2: "+item2.furnitureType+", Price: $"+ item2.calculateDiscountPrice());
        System.out.println("Item 3: "+item3.furnitureType+", Price: $"+ item3.calculateDiscountPrice());
        System.out.println("Item 4: "+item4.furnitureType+", Price: $"+ item4.calculateDiscountPrice());
    }
}