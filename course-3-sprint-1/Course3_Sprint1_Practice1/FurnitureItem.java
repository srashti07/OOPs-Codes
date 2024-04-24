import java.util.Scanner;
public class FurnitureItem {
    String color;
    String type;
    String grade;
    boolean isOutdoor;
    double price;
    Scanner sc;
    void acceptDetails()
    {
        sc = new Scanner(System.in);
        System.out.println("Enter the color, type, grade, isOutdoor, price");
        color = sc.next();
        type = sc.next();
        grade = sc.next();
        isOutdoor = sc.nextBoolean();
        price = sc.nextDouble();
    }
    void display()
    {
        System.out.println("color : \t"+color+"\t type : \t"+type+"\t grade : \t"+grade+"\t isOutdoor \t"+isOutdoor+"\t price : \t"+price);

    }
    public double calculateDiscount(double discount)
    {
        if (isOutdoor){
            return (price * discount);
        }
        return 0;
    }
    public double getPrice()
    {
        return price;
    }
    public static void main(String[]input)
    {
        FurnitureItem furniture = new FurnitureItem();
        furniture.acceptDetails();
        furniture.display();
        double discountApplied=furniture.calculateDiscount( 0.5);
        System.out.println("after discount = \t"+discountApplied);
        double finalPrice = furniture.getPrice() - discountApplied;
        System.out.println("Final price = \t"+ finalPrice);
    }

}