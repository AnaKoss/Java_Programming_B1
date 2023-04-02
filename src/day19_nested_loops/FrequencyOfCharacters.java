package day19_nested_loops;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

      String word = "apple"; // 5
                 //  01234
      String checked = "";
        for (int i = 0; i < word.length(); i++) {
            int count = 0; // count = 0;
            char letter = word.charAt(i); // i = 0--> letter = a

                    if (!checked.contains("" + letter)){
                        for (int j = 0; j < word.length(); j++) {
                            char eachLetter = word.charAt(j);
                                                              // true  | false | false   | false  | false
                                if (letter == eachLetter){   // a == a | a == p | a == P | a == l | a == e
                                    count++;
                                }
                        }
                        System.out.println(letter + " - " + count);
                        checked += letter; //debaging
                    }
        }











    }
}
