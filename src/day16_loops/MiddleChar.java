package day16_loops;
/*
if the # of char are even - print the middle two
if the # of char are odd = print the middle one
 */
public class MiddleChar {

    public static void main(String[] args) {

        String word = "Californi"; //10 char
        //             0123456789

        boolean isEven = word.length()%2 == 0;
        if (isEven){
            System.out.println(word.substring(word.length()/2-1,word.length()/2+1));
        }else { //Californi - 9 char
            System.out.println(word.substring(word.length()/2, word.length()/2 +1) );
            System.out.println(word.charAt(word.length()/2));
        }

    }


}
