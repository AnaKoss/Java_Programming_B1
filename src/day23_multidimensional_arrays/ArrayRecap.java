package day23_multidimensional_arrays;

import java.util.Arrays;

public class ArrayRecap {
    public static void main(String[] args) {

        int [] arr = {30, 20 , 40 , 50 , 100};
        int [] arr2 = {180, 350, 27, 50};

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        System.out.println("____________________");

    Arrays.sort(arr);
    Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        System.out.println("Min in arr: " + arr[0]);
        System.out.println("Max in arr: " + arr[arr.length-1]);

        System.out.println("Min in arr: " + arr2[0]);
        System.out.println("Max in arr: " + arr2[arr2.length-1]);
        System.out.println("_____________");
        String [] words = {"java", "aql", "api", "softskills"};
        System.out.println("Before sorting: " + Arrays.toString(words));
        Arrays.sort(words);
        System.out.println("After sorting: " + Arrays.toString(words));

        System.out.println("______________");
        String afterJoin = String.join("^^^", words);
        System.out.println("after join: " + afterJoin);

        System.out.println("_______________");
        String sentence = "java, aql, api, softskills";
        String[] sentArr = sentence.split("aql");
        System.out.println(Arrays.toString(sentArr));

        System.out.println("________________");
        String sentenceTwo = "Hello Loopers";
        char [] chars = sentenceTwo.toCharArray();
        System.out.println(Arrays.toString(chars));

        for (char each: chars) {
            System.out.println(("" +each).toUpperCase());

        }
    }
}
