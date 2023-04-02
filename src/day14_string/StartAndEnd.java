package day14_string;

public class StartAndEnd {

    public static void main(String[] args) {



        String str = "Apples";
        boolean result1 = str.startsWith("App"); //true
        boolean result2 = str.startsWith("app"); //false

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);


        System.out.println(str.startsWith("Apple"));//true
        System.out.println(str.startsWith("Apples"));//true
        System.out.println(str.equals("Apple"));//false

        String sentence = "Today is Java day!";
        boolean end1= sentence.endsWith("day!"); //true
        System.out.println("end1 = " + end1);

        boolean end2 = sentence.endsWith("day"); //false
        System.out.println("end2 = " + end2);

        System.out.println(sentence.endsWith("is Java day!"));//true
        System.out.println(sentence.endsWith("ay!"));//true



    }
}
