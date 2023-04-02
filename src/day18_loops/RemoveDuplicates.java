package day18_loops;
// remove Duplicate
//whrite a program that can remove duplicates from String
//ex: input: abcaabc
//output: abc
public class RemoveDuplicates {
    public static void main(String[] args) {

        String word = "abcadaaefbc";
        String unique = "";


        for (int i = 0; i < word.length(); i++) {
            if (!unique.contains(""+ word.charAt(i))){ //"" + made it string bc other part is boolean condition EX: 'a' --> ("" + 'a') ==> "a"
                unique += word.charAt(i);
            }
        }

        System.out.println(unique);

    }
}
