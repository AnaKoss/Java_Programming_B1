package day33_a_static;

public class BestBuy {
// if we do nor have object we can not reach
// the instance variables
    String location;

    static String headQuarters = "Richfield, MN, USA";
static String day = "Sunday"; // is the same for all objects
static int numOfComputer = 100;


public BestBuy (String location){
    this.location = location;
}

//_______________________________________

    // this is an instance method which has
    // return type as VOiD and does not any
    // arguments
    public void openStore(){

        System.out.println("Opening the " + location);
    }
public static void reStock(){
    numOfComputer= 100;
    System.out.println(numOfComputer); // can use only any static variables
}




}