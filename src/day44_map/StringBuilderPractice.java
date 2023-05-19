package day44_map;



/*
StringBuilder
    it is also an object representation of sequence of characters
    !!!-->StringBuilder is mutable<--!!! and also can be modified
    It is NOT synchronize, meaning NOT thread sage
    We can ONLY create object of StringBuilder by the "NEW" keyword.
    It is coming from java.lange package
 */
public class StringBuilderPractice {
    public static void main(String[] args) {


        StringBuilder stringBuilder = new StringBuilder("Hello");

        stringBuilder.reverse();
        System.out.println(stringBuilder);


        stringBuilder.append(2);
        System.out.println(stringBuilder);


        stringBuilder.append("olleh");
        System.out.println(stringBuilder);


        stringBuilder.delete(0,5);
        System.out.println(stringBuilder);

        stringBuilder.insert(1,"TEST");
        System.out.println(stringBuilder);

        stringBuilder.replace(5, 7, "______");
        System.out.println(stringBuilder);



    }
}
