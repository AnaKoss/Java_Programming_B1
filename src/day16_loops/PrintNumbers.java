package day16_loops;

public class PrintNumbers {
    public static void main(String[] args) {

        int n = 2;
        //  while(n<=10) {
        //     System.out.println(n);
        //     n++;
        // }

        while (n <= 10) {
            System.out.println(n);
            n += 2;
        }
        System.out.println("_________________________");

        n = 2;
        while (n <= 10) {
           if (n%2 ==0){
               System.out.println(n);
        }
        n++;
    }

    }

}