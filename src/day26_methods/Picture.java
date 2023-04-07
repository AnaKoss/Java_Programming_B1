package day26_methods;

import org.w3c.dom.ls.LSOutput;

public class Picture {
    // how about if i have same methodName with either different parameter amounts, or different dataTypes?
    // drew(int a){};
    //draw (double b);
    //draw (boolean c);
    //draw (int a, double d);

    public static void main(String[] args) {


    }

    public static void draw() { //non-parameterized method
        System.out.println("Trying to draw"); // body of the method
    }

    public static void draw(String color) { // a parameterize method - overloaded method
        System.out.println("Drawing with the " + color);
    }

    public static void draw(String color, String color2) {
        System.out.println("Drawing with two different colors: " + color + " and " + color2);
    }

    public static void draw(int size) {
        System.out.println("Drawing in this size: " + size);
    }
    //public static void draw ( int length ){---> we can not overload with the different PARAMETER NAME. It has to be different dataType or differernt amount of parameters
    public static void draw ( String str, int size){
        System.out.println("just drawing");
    }



}
