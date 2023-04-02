package day19_nested_loops;

public class NestedLoopExample {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("hello Loop Academy");
        }
        System.out.println("_____________________");

        for (int i = 0; i < 2; i++) {
            for (int j = 1; j < 3; j++) {
                System.out.println("HELLO");
            }
        }

        System.out.println("_________________-");
        for (int i = 1; i <=3 ; i++) { // will print 3 times , if int i = 0; will print 4 times
            System.out.println("hello");
        }

        System.out.println("_________________");
        for (int i = 0; i < 1; i++) {
            System.out.println("This is the number " + i + " iteration"); // 1 time
            for (int j = 0; j < 2; j++) {
                System.out.println("hello Loop Academy");// 2 times
                for (int k = 0; k < 3; k++) {
                    System.out.println("java"); // 3 times
                }
            }
        }

    }
}
