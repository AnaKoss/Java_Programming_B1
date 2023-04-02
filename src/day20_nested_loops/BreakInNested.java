package day20_nested_loops;

public class BreakInNested {
    public static void main(String[] args) {


        for (int i = 0; i < 5; i++) {
            System.out.println("i " + i);  // i = 0     | i =1   | i = 3

            if (i == 3){ // 0 not = 3   | false to skip           | 3 = 3
                //break; // false - will jump down to next line    | true  (stop loop) npt print anything
            }

            for (int j = 0; j <2 ; j++) {   // j=0 ; j= 1   | j=0; j=1;  | by 3 --> not print anything
                System.out.println("j" + j);
                break; // breaks only part of the inner loop
            }
            break;


        }

    }
}
