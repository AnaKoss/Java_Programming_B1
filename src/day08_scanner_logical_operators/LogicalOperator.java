package day08_scanner_logical_operators;

public class LogicalOperator {
    public static void main(String[] args) {

      //in Math
//Q: give me a number bigger than 3 AND less than 7?
        //A: 3 < myNumber < 7

       // 3 < 5             ---- > true
       // 5 < 7        ---- > true

       // Q: give me a number bigger than 3 or equal AND less than 7 //or equal?

       // A: 3 <= myNumber <= 7

        //In Java

      //  3 < myNumber < 7

       // 3 < nyNumber  AND  myNumber < 7         --- > &&  --- > it is called AND operator

int num = 20;
        System.out.println(num >5);
        System.out.println(num <10);
        System.out.println( num > 5 && num > 10);

        boolean isCorrect = false;
        System.out.println( isCorrect);
        System.out.println(false);
        System.out.println(!false);
        System.out.println(!isCorrect);



    }
}
