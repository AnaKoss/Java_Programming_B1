package day07_relational_operators;

public class SignType {
    public static void main ( String [] args){
        // declare & assign the #
        //I want to know the sign of the #
        // if the # positive
        //if the # is negative
        // if the # is 0

        int number =-1;
                number--;
        boolean isPositive = number >= 0;
        boolean isNegative = number <= 0;
        boolean isZero = number == 0;

        System.out.println(number + " is bigger than zero "+ isPositive);
        System.out.println(number + " is less than zero "+ isNegative);
        System.out.println(number + " is equal than zero "+ isZero);








    }
}
