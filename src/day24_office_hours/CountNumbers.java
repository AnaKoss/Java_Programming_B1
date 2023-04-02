package day24_office_hours;

// count up to a certain number
// start from 0
// all the numbers until the number input
// methods(5) --> 0 1 2 3 4 5
// methods(10) --> 0 1 2 3 4 5 ...10
public class CountNumbers {


    public static void printNum (int num){
        for (int i = 0; i <=num ; i++) {
            System.out.print(i+ " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
printNum(10);
printNum(5);
        //System.out.println(); separate the lines and start from new line
printNum(22);

    }
}
