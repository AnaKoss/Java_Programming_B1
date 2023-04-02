package day19_nested_loops;

public class NestedLoopExample2 {
    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {
            if (i == 1) {
                System.out.println("Color is red ");
            } else if (i == 2 ){
                System.out.println("Color id blue");
            } else if (i == 3 ){
                System.out.println("Color is black");
            }
        }

        System.out.println("___________________________________");

        for (int i = 0; i < 5; i++) {
            System.out.println("A" + i);
            for (int j = 0; j < 5; j++) {
                System.out.println("\tB" + j);
            }
            System.out.println();
        }
        System.out.println("____________________________________");

String str = "Java"; // ptint each char separetly
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

        System.out.println("______________________________");


        for (int i = 0; i < str.length() ; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.println(str.charAt(i));
            }
            System.out.println( );
        }
    }
}
