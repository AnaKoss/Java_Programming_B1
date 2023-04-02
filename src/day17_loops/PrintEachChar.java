package day17_loops;

public class PrintEachChar {
    public static void main(String[] args) {


String str = "Java";
//            0123

        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3));

        System.out.println("______________________________");


        for (int i = 0; i < 4; i++) {
            System.out.println(str.charAt(i));
        }

        System.out.println("_______________________________");

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }



    }
}
