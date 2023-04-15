package day30_a_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

/*
make a method that accepts ArrayList and prints the list (String)
make a method that accepts a number and prints the dya of the week
use the main method to call those two methods
 */
public class ArrayListWithMethods {


    //make a method that accepts ArrayList and prints the list (String)
    public static String getList (ArrayList<String> list){
        /*
        LIST: banana
              apple
         */
      String finalList = "LIST: ";
        for (String each: list) {
            finalList+="\n\t" + each;
        }
        return finalList;
    }
    //make a method that accepts a number and prints the dya of the week
    public static void printDayOfWeek (int numDay){ //1
        ArrayList<String> daysOfWeek = new ArrayList<>(Arrays.asList("Mon","Tue","Wed","Thr","Fri","Sat","Sun"));
        if (numDay >=1 && numDay<=7){
            System.out.println(daysOfWeek.get(numDay-1));
        }else{
            System.out.println(numDay+ " is not in the range of 1 -7");
        }


        if (numDay<0 || numDay>7){
            System.out.println("Number not in the range");
        }


    }





    public static void main(String[] args) {

       ArrayList<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "water","butter" ));
        System.out.println(getList(list));

        printDayOfWeek(10);
        printDayOfWeek(1);

    }

}
