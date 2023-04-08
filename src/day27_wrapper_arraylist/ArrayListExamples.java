package day27_wrapper_arraylist;

import java.util.ArrayList;

public class ArrayListExamples {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(); //by default capacity is 10 ---> This is does not mean the size is 10
        System.out.println(numbers.size());
        System.out.println("--------");

        System.out.println(numbers);
        numbers.add(10); //once i use add() method, it adds it to the end of the ArrayList
        System.out.println(numbers);

        numbers.add(-200); //once i use add() method and give arguments as -200 , it adds it to the end of tne ArrayList
        System.out.println(numbers);


        numbers.add(45);
        numbers.add(77);
        System.out.println(numbers);
        System.out.println("______________");

        System.out.println(numbers.size());
        //how can i get the element which is in the 1st index?
        //In array to get the specific indexed element we use arr[1];
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(1));
        System.out.println(numbers.get(2));
        System.out.println(numbers.get(3));
        //System.out.println(numbers.get(4)); // Run time exception--> IndexOutOfBoundsException

        /*
        size()
        get(int i)
        add(dataType
        add(index, number)
         */

        numbers.add(33); //ArrayList allows thr duplicate value
        System.out.println(numbers); //ArrayList reserve the insertion order


        numbers.add(1, -77);
        System.out.println(numbers);
    }
}