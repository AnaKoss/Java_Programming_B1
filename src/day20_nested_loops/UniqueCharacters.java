package day20_nested_loops;
/*
given a string , find and print the unique char


 */
public class UniqueCharacters {
    public static void main(String[] args) {

String str = "AAABCCDEEF";  // 10 char
//            0123456789

        for (int i = 0; i < str.length() ; i++) { // A , A , A , B .....

            char outerLetter = str.charAt(i);
         int count = 0;
            for (int j = 0; j < str.length(); j++) {
                char innerLetter = str.charAt(j);
                    if (outerLetter == innerLetter){
                        count++;
                    }
            }
            if (count ==1){
                System.out.println(outerLetter);
            }


        }





    }
}
