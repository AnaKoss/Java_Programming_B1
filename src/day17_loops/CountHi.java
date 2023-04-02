package day17_loops;

public class CountHi {
    public static void main(String[] args) {


        String sentence = "ahiaahiaaajfuihijdjskidkmjaaadhjahiajaiajajhiaja";

        int countHi = 0;
        for (int i = 0; i <sentence.length() ; i++) {

            if (sentence.charAt(i)== 'h' && sentence.charAt(i+1) =='i'){
                countHi++;
            }
        }
        System.out.println(countHi);

    }
}
