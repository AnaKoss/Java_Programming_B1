package day24_methods;
/*
given 2D string array, concatenate the last character of each inner element on one line, then each following array values in separate  line
ex: {"James", "is", "back"}
 {"he", "was", "never", "gone"}
 {"methods, "tomorrow"}
 output:
 ssk
 esre
 sw
 */
public class LastCharacters2D {

    public static void main(String[] args) {


        String [][] info = {
                {"James", "is", "back"},
                {"he", "was", "never", "gone"},
                {"methods", "tomorrow"}
        };

        //info[0].length --> 3
        //info[1].length --> 4
        //info[2].length --> 2
        //info.length ----> 3

        for (String[] eachArr : info){
            for ( String eachWord: eachArr){
                System.out.print(eachWord.substring(eachWord.length()-1));
                //System.out.print(eachWord.charAt(eachWord.length()-1)); // this is other wat to asses the last char of each word

            }
            System.out.println();
        }
        System.out.println("____________________");
        for (String [] eachArr : info){
            for (String eachWord : eachArr){
                System.out.print(eachWord.charAt(0));
            }
            System.out.println();
        }






    }
}
