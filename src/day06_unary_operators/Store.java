package day06_unary_operators;

public class Store {

    public static void main(String[] args) {

        String store = "Target";
        int numberOfTv = 100;

        System.out.println("I have a total of " + numberOfTv + "TVs");

        System.out.println("Person comes into the store and they bout a TV");

        System.out.println("Number of TV left in the store: " + numberOfTv);
        System.out.println("Number of TV left in the store: " + --numberOfTv);
        System.out.println("Number of TV left in the store: " + --numberOfTv);
        System.out.println("Another person comes into the store and return the TV");
        System.out.println("Number of TV left in the store: " + ++numberOfTv);
        System.out.println("Number of TV left in the store: " + numberOfTv++);
        System.out.println("Number of TV left in the store: " + numberOfTv--);



    }
}
