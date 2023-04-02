package day22_arrays;

import java.util.Arrays;

public class SplitExample {
    public static void main(String[] args) {

        String days = "monday, tuesday, wednesday, thursday, friday, saturday, sunday";

int countWords = 0;
        for (int i = 0; i < days.length(); i++) {
            if (days.charAt(i) == ','){
            countWords++;
            }
        }
        System.out.println("Total words: "+ (countWords+1));


        String [] dayArr = days.split(", ");
        System.out.println(Arrays.toString(dayArr));

        String [] dayArr2 = days.split("ay");
        System.out.println(Arrays.toString(dayArr2));

        String day = "monday, tuesday, wednesday, thursday, friday, wednesday, saturday, sunday";

        String [] dayArr3 = day.split("wednesday");
        System.out.println(dayArr3.length);
        System.out.println(Arrays.toString(dayArr3));

        String month  = "jan-fab-mar-apr-may-jun-jul-aug-sep-oct-nov-dec";
        String [] monthArr = month.split("-");
        for (String eachMonth: monthArr){
           // System.out.println(eachMonth);
            //System.out.println(eachMonth.toUpperCase());
            System.out.println(eachMonth.substring(0,1).toUpperCase() + eachMonth.substring(1));
        }


    }
}
