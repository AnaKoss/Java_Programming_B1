package day16_loops;

public class MethodChaining {
    public static void main(String[] args) {

        String word = "    Java is a great language    ";
        word = word.trim();
        System.out.println(word);

        //word = word.substring(0,4);
        word = word.substring (0, word.indexOf(" ")); //dymanic
        System.out.println(word);

        System.out.println("_______________________________");
        word = "    Java is a great language    ";
        System.out.println(word);
        word = word.trim().substring (0, 4).toLowerCase().toUpperCase();
        //word = word.trim().substring (0, word.indexOf(" "));
        System.out.println(word);

    }
}