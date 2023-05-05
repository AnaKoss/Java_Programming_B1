package day38_a_abstraction.language;

public class Translator {
    public static void main(String[] args) {
        //language lng = new Language();
        //we can do this bc interface canNOT be instantiated

        Turkish tr = new Turkish();
        tr.hi();
        tr.bye();
        System.out.println("_____");

        Spanish sp = new Spanish();
        sp.hi();
        sp.bye();


    }
}
