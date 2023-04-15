package day30_b_custom_classes;

public class UsingCoffee {


    public static void main(String[] args) {

Coffee coffee1 = new Coffee();
        System.out.println(coffee1);
        System.out.println("___________________");
coffee1.price = 1.99;
coffee1.size = "Large";
coffee1.brand = "Starbucks";
coffee1.type = "Black";
        System.out.println(coffee1);
        System.out.println("____________________");

        coffee1.drink();

        System.out.println("____________________");

        coffee1.refill(0.50);
        System.out.println("____________________");
        coffee1.totalCost(5.0);
        System.out.println(coffee1.price);
    }

}
