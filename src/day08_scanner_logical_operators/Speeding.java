package day08_scanner_logical_operators;

public class Speeding {
    public static void main(String[] args) {

        // declare 3 variables:
        // Current speed
        // speed limit
        //speeding
        // print : "Is this person speeding ? true oe false

        int currentSpeed = 70;
       int speedLimit = 65;
      boolean isSpeeding = currentSpeed >= speedLimit;

        System.out.println("Is this person speeding? "+ isSpeeding);


    }

}
