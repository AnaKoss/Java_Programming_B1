package day13_string;

public class UpperOrLower {

    public static void main(String[] args) {

        //Scanner input = new Scanner ( System.in):
        //System.out.println("Enter a letter: ");
        //String letter = input.next(); // "a" --> 97
        // lower case range --> 97 - 122
        // upper case range --> 65 - 90
        //there is a different about 32 between lower and upper case
        char letter = 'a';
        if ( letter >=97 && letter <=122){

            System.out.println("You entered letter: " + letter + "\nYour converted letter: " + (char)(letter -32) );

        }else if (letter >=65 && letter <=90){
            System.out.println("You entered letter "+ letter + "\n Your converted letter: " + (char)(letter + 32));
        }else {
            System.out.println("It is not a lower or upper case letter");
        }




    }





}
