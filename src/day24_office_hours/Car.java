package day24_office_hours;

import java.sql.SQLOutput;

//make a method that prints out "Unlocking the car"
public class Car {
    public static void unlockCar (){
        System.out.println("Unlocking the car");
    }

    // declare the method that prints out "Opening the door"

    public static void openDoor(){
        System.out.println("Opening the door");
    }
//declare method that prints out "Getting in the car" / "Closing the door"
    public static void gettingIn(){
        System.out.println("Getting in the car");
        System.out.println("Closing the door");
    }
    // declare the method that prints couple statements for getting ready
    public static void getReadyToGo(){
        System.out.println("Putting a seatbelt");
        System.out.println("Checking mirrors");
        System.out.println("Put music on");
        System.out.println("Put on a navigator");
    }
    //declare a method that starts the car
    public static void startCar(){
        System.out.println("starting the car");
    }
    // declare a method for driving
    public static void getReady(){
        System.out.println("Putting gear into Drive mode");
        System.out.println("Start driving");
    }
    public static void startToDrive(){ // make they all together instead of calling them separate!!
        unlockCar();
        openDoor();
        gettingIn();
        getReadyToGo();
        startCar();
        getReady();
    }
    public static void main(String[] args) {
      //  unlockCar();
      //  openDoor();
      //  gettingIn();
      //  getReadyToGo();
       // startCar();
       // getReady();
        startToDrive();
        System.out.println("__________");
        openDoor();
    }
}
