package day23_muotidimensional_arrays;

import java.util.Arrays;

public class CopyExample {
    public static void main(String[] args) {

        int [] a = {1, 2, 3, 4};
        int [] b = a; // this is not a new arrays, just b is referencing to a's array

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println("_________________");
        a[0] = 100;
        b[1] = 200;

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println("_________________");

int [] c = Arrays.copyOf(a, a.length); //this is a new array !!!!!!!!

        System.out.println(Arrays.toString(c));
        c[0] = -300;
        System.out.println(Arrays.toString(c));

        System.out.println("_________________");

int [] d = Arrays.copyOf(a, a.length + 2); // length = 6 , making 2 more place !!!!!

        System.out.println(Arrays.toString(d));
    d[d.length -1] = -900;
        System.out.println(Arrays.toString(d));


    }
}
