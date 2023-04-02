package day16_loops;

public class Factorial {
    public static void main(String[] args) {
        //what is the factorial 4?
        // 4! = 4*3*2*1

        int num = 5;
        int result = 1;
        while (num >1){
            System.out.println(result + " + " + num);
            result *= num;
            num--;
        }
        System.out.println(result);










    }
}
