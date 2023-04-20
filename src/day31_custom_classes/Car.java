package day31_custom_classes;

public class Car {
    /*
    create instance variables:
    model, year, color, fuel level (percent number)
     */

    String model;
    int year;
    String color;
    int fuelLevel;

   /*
   - fillTank ():[void]
   prints: filling tank
   fuel level will be maxed as 100
    */

    public void fillTank (){
        System.out.println("filling tank");
        fuelLevel=100;
    }

    public void fillTank (int level){ //overloading method
        System.out.println("filling tank");
        fuelLevel = fuelLevel+ level;
    }


    public String toString() {
        return "Car:" + "\nmodel= " + model+
                "\nyear= " + year +
                "\ncolor= " + color +
                "\nfuelLevel= " + fuelLevel;
    }
}
