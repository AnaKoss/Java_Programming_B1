package day15_string;

public class CharMethod {

    public static void main(String[] args) {

        String word = "loop"; // 4 characters
        //             0123

        System.out.println(word.length());

        System.out.println(word.charAt(3));
        //System.out.println(word.charAt(4));// give error

        String longWord = "hgjfksbhdjndkfhdgjfhgjdkdfhgjdkhfdgdjdfdhgjdhfdbjnd"; // # 0 - 50

        System.out.println(longWord.length());//#  51

        int lastIndex = longWord.length()-10;
        System.out.println(longWord.charAt(lastIndex));
    }
}
