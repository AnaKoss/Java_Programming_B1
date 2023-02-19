package day05_variables;

import java.sql.SQLOutput;

public class CellPhone {
    public static void main(String[] args) {

 /*
        create a class CellPhone

        create a main method
        declare and assign these variables:
            brand, model, color, price, storage, hasCamera, sim(char A, B, C)
        Print all the variables
            sample data: apple, iphone 10, black, 1000.99, 128, true, A
     */

      String brand = "apple";
      String  model= "IPhone 10";
      String color = "black";
      double price = 1000.99;
      int storage = 128;
      boolean hasCamera = true;
      char sim = 'A';

        System.out.println( "I have an " + model + " from " + brand);
        System.out.println("It came in the color " + color + " and it has " + storage + "GB");
        System.out.println("For the sim type " + sim + " with a camera " + hasCamera + " the total price was $" + price);




    }
}
