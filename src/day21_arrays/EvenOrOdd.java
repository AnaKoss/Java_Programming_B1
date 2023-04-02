package day21_arrays;
/*
even and odd from array
write a program that can count
even: 2
odd: 3
 */
public class EvenOrOdd {
    public static void main(String[] args) {
        int [] nums = {4,1,3,12,5};
        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i < nums.length; i++) {

            if ( nums [i] % 2 == 0){
                countEven++;
            }else{
                countOdd++;
            }
        }
        System.out.println("Even count: " + countEven);
        System.out.println("Odd count: " + countOdd);

        System.out.println("_________________________");

        int countEven1 = 0;
        int countOdd1 = 0;
        for (int eachElement: nums) {

            if ( eachElement % 2 == 0){
                countEven1++;
            }else{
                countOdd1++;
            }
        }
        System.out.println("Even count: " + countEven1);
        System.out.println("Odd count: " + countOdd1);






    }
}
