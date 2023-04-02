package day24_methods;

public class CreditScore {
    public static int getCreditScore (){
        return 800;
    }

public static String isGoodCreditHistory (int score){

        if (score > 750){
            return "Great";
        }else if (score >= 720 && score <=750){
            return "Good";
        }else {
            return "Poor";
        }
}

public static boolean isGoodScore ( int score){
        if (score >750){
            return true;
    }else {
            return false;
        }
}

    public static void main(String[] args) {
    System.out.println(getCreditScore());
    // int score = getCreditScore();
       // System.out.println(score);
        System.out.println(getCreditScore() + 50);

        System.out.println("Sky's credit score is 800. That score is " + isGoodCreditHistory(800));
        System.out.println("Sky's credit score is 800. Is that score good?  " + isGoodScore(820));
    }


}
