package day09_b_if_statements;

public class SingleIf {

    public static void main(String[] args) {
        // if condition is true print out "Today is java day"

        if (true) {
            System.out.println("Today is java day");
        }

        //System.out.println("Today is java day");

        // max # of days in Feb 28
        int maxNumOfDay = 28;

        if (maxNumOfDay <= 29) {
            System.out.println("This month is Feb");

        }
        int year = 2021;

        //if year is equal or bigger than 2023 AND less than OR equal to 2022=== it is true

        boolean isCovidYears = year >= 2021 && year <= 2022; // year ==2021 || year ==2022;

        if (isCovidYears) {
            System.out.println("It was Covid Year");

        }



    }
}
