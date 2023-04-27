package day34_a_static.computer;

public class Computer {
    //data: brand, price, color
    String brand;
    double price;
    String color;
    //same data for all: hasScreen, hasBattery, HasMemory
    static boolean hasScreen, hasBattery, hasMemory;

//make static block
//print: Static block
//initialize static variables

static{
    System.out.println("Printing static block"); // this runs only 1 time
    hasScreen = false;
    hasBattery = true;
    hasMemory = false;
    //color = "Blue"; --> static accept static , it is instance
    //static does not accept instances but instance accepts static
        }
//make a constructor that initialize the instance variables
    public Computer (String brand, double price, String color){
    this.brand = brand;
    this.price = price;
    this.color = color;
    }





}