package day12_switch_statements;

public class MaleOrFemale {


    public static void main(String[] args) {

        char letter = 'm';

        switch (letter) {

            case 'm':
            case 'M':
                System.out.println("Male restroom");
                break;

            case 'f':
            case 'F':
                System.out.println("Female restroom");
                break;

            default:
                System.out.println("Invalid letter");

        }



    }
}
