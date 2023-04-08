package day27_wrapper_arraylist;

import my_util.ArrayUtil;

import java.util.Arrays;

public class UsingArrayUtil {
    public static void main(String[] args) {

        ArrayUtil.addElemBeginning(34,23,345,23,213,213);

        System.out.println(Arrays.toString(ArrayUtil.addElemBeginning(12,45,76,4567,34)));


int [] nums ={23, 456, 78, 90 , 98};
int addNum = 456;
        System.out.println(Arrays.toString(ArrayUtil.addElemBeginning(addNum, nums)));

        String [] allWords = {"hello", "tom", "jerry"};
        String word = "Anna";
        System.out.println(Arrays.toString(ArrayUtil.addElemBeginning(word, allWords)));
    }




}
