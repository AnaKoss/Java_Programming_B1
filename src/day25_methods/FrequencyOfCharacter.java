package day25_methods;

public class FrequencyOfCharacter {

    public static int frequencyOfCharacter (String str, char ch){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) ==ch){
                count++;
            }
        }
        return count;
    }


}
