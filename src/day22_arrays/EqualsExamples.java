package day22_arrays;

import java.util.Arrays;

public class EqualsExamples {
    public static void main(String[] args) {

        int [] a = {1, 2, 3, 4};
        int [] b = {1, 2, 3, 4};
        int [] c = a;

        System.out.println(a == b); // false bc it is 2 different objects
        System.out.println(a == c);
        System.out.println(Arrays.equals(a,b));

        boolean result = Arrays.equals(b,c);
        System.out.println(result);

    }
}
