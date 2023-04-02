package day13_string;

public class StringMethods {
    public static void main(String[] args) {


        String  name = "James";

        // how to compare 2 strings exactly --> we use .equals()
        System.out.println(name.equals("James"));


        System.out.println("cat".equals("dog"));

        System.out.println(name.equals("james"));

        // how to compare 2 strings ignoring case sensitiveness

        System.out.println(name.equalsIgnoreCase("James"));

    }

}
