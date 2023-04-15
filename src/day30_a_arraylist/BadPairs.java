package day30_a_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

/*
input
{3, 4, 6, 1, 1, 10, 8, 7};--> which will always have total of even amount
Output:
{3, 4, 1, 10};  --> will remove num if in the pair the lest num is bigger--> remove

 */
public class BadPairs {

    public static ArrayList<Integer> pairs (ArrayList<Integer> list){
ArrayList <Integer> goodPairs = new ArrayList<>();
        for (int i = 0; i < list.size(); i+=2) { // it will be stat nex cycle 0 2 4 6 , jump
            if (list.get(i)<list.get(i + 1)){ // >  if you need to look if the 1 num bad
               goodPairs.add(list.get(i));
               goodPairs.add(list.get(i+1));

            }
        }
return goodPairs;

    }
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(3, 4, 6, 1, 1, 10, 8, 7));
        System.out.println(nums);
        System.out.println(pairs(nums));

    }
}
