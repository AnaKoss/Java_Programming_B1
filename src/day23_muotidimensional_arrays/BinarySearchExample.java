package day23_muotidimensional_arrays;

import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {
        int [] num = {4, 10, 40, 30, 200};
        System.out.println(Arrays.binarySearch(num, 4));
        System.out.println(Arrays.binarySearch(num, 10));
        System.out.println(Arrays.binarySearch(num, 200));
        System.out.println(Arrays.binarySearch(num, 40)); // NEEDS TO BE SORTED!!!!!!that is why it is not given the correct index.

    }
}
