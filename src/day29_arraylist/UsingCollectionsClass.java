package day29_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UsingCollectionsClass {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(3,6,2,67,22,230,12));
        System.out.println(list);

//.sort(); // $_ 12345 ASDFG fgngh --> order
        Collections.sort(list);
        System.out.println(list);

//.reverse();
        Collections.reverse(list);
        System.out.println(list);

        ArrayList<Character> letters = new ArrayList<>(Arrays.asList('A', 'B', 'C'));
        System.out.println(letters);
         Collections.reverse(letters);
        System.out.println(letters);

//.max() and .min()
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));

//.swap(Collections, index1 , index2)
        Collections.swap(list, 0, 1);
        System.out.println(list);

//.frequency(Collection, element)
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(11, 11, 22, 11, 77, 88));
        System.out.println(nums);
        int count = Collections.frequency(nums, 11);
        System.out.println(count);

        ArrayList <String> words = new ArrayList<>(Arrays.asList("one", "two", "one", "one", "three", "one"));
        System.out.println(Collections.frequency(words, "one"));




    }
}
