package day18_loops;

public class BranchingExample {
    public static void main(String[] args) {


        for (int i = 0; i <=10 ; i++) {
            System.out.println(i + " ");
            }

            System.out.println("______________");

        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " ");
            if (i == 5) {
                break;
            }
        }

        System.out.println("_____________________");

        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " ");
            break;
        }

        System.out.println("______________");

        for (int i = 0; i <= 10; i++) {// no 5 in output
            if (i == 5) {
                continue;
            }
            System.out.println(i + " ");
        }

        System.out.println("______________");

        for (int i = 0; i <= 10; i++) {// even numbers only
            if (i % 2 == 1) {
                continue;
            }
            System.out.println(i + " ");
        }

        System.out.println("______________");

        for (int i = 0; i <= 10; i++) {// odd numbers only
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i + " ");
        }

        System.out.println("______________");

        for (int i = 0; i < 10; i++) {//
            System.out.println(i + "" + i);
        }
        System.out.println("______________+");

        for (int i = 0; i < 100; i++) {
            if (i == 10) {
                break;
            }
            System.out.println(i + "" + i);

        }

    }

}