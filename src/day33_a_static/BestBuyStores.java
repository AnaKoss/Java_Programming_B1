package day33_a_static;

public class BestBuyStores {
    public static void main(String[] args) {

        System.out.println(BestBuy.headQuarters);
        System.out.println(BestBuy.day);
        System.out.println(BestBuy.numOfComputer);


        BestBuy store1 = new BestBuy("DC");
        System.out.println(store1.location);
        System.out.println(store1.numOfComputer);

        store1.numOfComputer-= 10;
        System.out.println(store1.numOfComputer);
BestBuy store2 = new BestBuy("Baltimore");
        System.out.println(store2.numOfComputer);


        store2.location = "Towson";
        System.out.println(store1.location);
        System.out.println(store2.location);

        store2.day = "Weekday"; // if you change it for object, it changes for all
        System.out.println(BestBuy.day);
        System.out.println(store1.day);
        System.out.println(store2.day);

        System.out.println("________");
        BestBuy.day = "Monday";
        System.out.println(BestBuy.day);
        System.out.println(store1.day);
        System.out.println(store2.day);
        System.out.println("_______________________");

        //static method i can call either with Class name
        // or object but Proper way is to use classname/
        BestBuy.reStock();

        System.out.println(BestBuy.numOfComputer);
        store1.reStock();
        // since openStore() is an instance method,
        // we can not call it by Classname
        //BestBuy.openStore();

        store1.openStore();
        store2.openStore();


    }
}
