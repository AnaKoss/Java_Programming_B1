package day20_nested_loops;
/*
[IQ] prime in range
given a number. Print out all the prime # from 2 to thet # A prime # is a # that is only divisible by 1 and itself
ex: input : 50 --> 1........50
output: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47
 */
public class PrimInNumbers {
    public static void main(String[] args) {

        int num = 50;
        for (int i = 2; i <= num  ; i++) { // 2, 3, 5, 7..... // start outer loop


            int count = 0; // putting the ciunter inside the outer loop will reset it back to 0 on each
            for (int j = 2; j <= i; j++) { // inner loop
                if (i % j == 0){
                    count ++;
                }
            }

            if (count ==1 ){
                System.out.println(i + ", ");
            } // inner loop ENDS

            //if (i % 1 == 0 && i % i == 0){  // will not work with our case
             //}



        } // ending of Outer loop






    }




}
