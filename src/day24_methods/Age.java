package day24_methods;

public class Age {
    /*
    make a method that accepts a number /year
    and calculates how old are you
     */

    public static void calculateAge (int bornYear){

        int currentYear = 2023;
        int yourAge = currentYear - bornYear;
        System.out.println("You are " + yourAge + " years old");


    }

    public static void main(String[] args) {
        calculateAge(1987);

    }









}
