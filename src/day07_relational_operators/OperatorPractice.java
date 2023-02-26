package day07_relational_operators;

public class OperatorPractice {
    public static void main(String[] args) {

        int i =5;
        //     | 6 |  5 |  6  |   5
        int y =-i++ + --i + i++ / i--;
        // y = -5   +   5 + 5  /  6 ====> 5/6 = 0.8 but bc int will be take only whole # and it will be 0
        // y = 0
        // i++ -> post
        // ++i -> pre

        System.out.println (i);
        System.out.println (y);



    }
}
