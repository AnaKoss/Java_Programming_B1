package day06_variables;

public class BasicCaculator {

    public static void main(String[] args) {

        double num1 = 5;
        double num2 = 4;

//        double addition = 4 + 5;  // hard coded 4 + 5

        double addition = num1 + num2;  // dynamic

        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = num1 / num2;
        double reminder = num1 % num2;
        double modulus = num1 % num2;

        System.out.println( num1 + " + " + num2 + " = " + addition);
        System.out.println( num1 + " - " + num2 + " = " + subtraction);
        System.out.println( num1 + " * " + num2 + " = " + multiplication);
        System.out.println( num1 + " / " + num2 + " = " + division);
        System.out.println( num1 + " % " + num2 + " = " + reminder);
        System.out.println( num1 + " % " + num2 + " = " + modulus);

        System.out.println( num1 + " + " + num2 + " = " + num1 + num2);

    }

}
