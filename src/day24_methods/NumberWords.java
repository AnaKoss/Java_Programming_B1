package day24_methods;

public class NumberWords {
    public static int numOfWords(String sentence){
        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if(' ' == sentence.charAt(i)){
                count++;
            }
        }

        return count+1;
    }


    public static void main(String[] args) {
       int numWords =  numOfWords("today is saturday. it is a java class!");
        System.out.println("I have total " + numWords + " words");


    }
}
