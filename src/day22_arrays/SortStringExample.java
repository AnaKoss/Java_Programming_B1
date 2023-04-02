package day22_arrays;

import java.util.Arrays;

public class SortStringExample {
    public static void main(String[] args) {

        String[] str = {"java", "Loop", "while", "softskills", "HELLO", "bye", "$", "454TA"};

        System.out.println(Arrays.toString(str));

        Arrays.sort(str);
        System.out.println(Arrays.toString(str));


    }
}
