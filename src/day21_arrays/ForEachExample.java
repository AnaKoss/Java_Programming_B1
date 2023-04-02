package day21_arrays;

public class ForEachExample {
    public static void main(String[] args) {

        int [] nums = {30, 12, 159, 12};
//                      0   1   2    3
        for (int i = 0; i < nums.length; i++) {
            System.out.println("With Traditional for loop: " + nums[i]);
        }
        System.out.println("_________________________________ ");

        for (int each: nums) {
            System.out.println("With Traditional for loop: " + each);
        }

        System.out.println("___________________________________");
String [] words = { "java", "soft skills", "selenium", "sql", "api"};
        for (int i = 0; i < words.length; i++) {
            System.out.println("With traditional for loop: " + words[i]);
        }
        System.out.println("_____________________________");
        for (String eachWord : words) {
            System.out.println("With foreach loop: " + eachWord);
                    if (eachWord.equalsIgnoreCase("api")){
                        break;
                    }
        }
    }
}
