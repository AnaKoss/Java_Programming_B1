package day10_a_if_statements;

public class TernaryExample {

    public static void main(String[] args) {

        int a = 4;
        String evenOrOdd;


        if (a % 2 == 0) {
            evenOrOdd = "Even";
        } else {
            evenOrOdd = "Odd";
        }


        System.out.println(evenOrOdd);
        System.out.println("____________");
        a = 9;

        evenOrOdd = (a % 2 == 0) ? "Even" : "Odd"; // String
        //int evenOrOdd2 = (5 > 4) ? 5 : 4;
        //or
        // int num;
        //if ( 5>4 ){
        // num = 5;
        //}else {
        //num= 4;
        //}

        System.out.println(evenOrOdd);
    }
}
