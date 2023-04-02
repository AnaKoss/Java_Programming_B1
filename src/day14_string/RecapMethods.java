package day14_string;

public class RecapMethods {

    public static void main(String[] args) {

        String str = "loop"; // we made String object by Literals
        String str2 = new String ("loop"); // made it by new keyword

        System.out.println("Compare with == " + (str ==str2));//false

        System.out.println("Compare with .equals()"+ (str.equals(str2)));

        System.out.println("Compare with == " + str.equals("Loop"));//false
        System.out.println("Compare with .equalIgnoreCase()" + str.equalsIgnoreCase("loop"));//true

        String word1 = "loop academy";
        System.out.println("To upper case: " + word1.toUpperCase());
        String word2 = "LOOP ACADEMY";
        System.out.println("To lower case: " + word2.toLowerCase());


        String word3 = "loOp AcAdEmY";
        System.out.println("To upper case: " + word3.toUpperCase());



    }


}
