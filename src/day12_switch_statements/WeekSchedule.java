package day12_switch_statements;


import java.util.Scanner;

/*
ask user to enter the day of week
print : which class we have on that day, the time of the class
M
w & Th - java class 7 - 10 pm
S  java class 9:30 am to 3 pm
Sn - no class

 */
public class WeekSchedule {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a day of the week: ");
       String dayOfWeek = input.next();
String message= "";
        switch (dayOfWeek){
            case "Monday":
            case "Mon":
            case"monday":
            case "Friday":
                message= "We do not have a class";
                break;
            case "Wednesday":
            case "Thursday":
                message = "We have Java class at 7 pm";
                break;
            case "Saturday":
                message = "We have Java class at 9:30am";
                break;
            case "Sunday":
                message = " we have Skill class at 9:30am";
            default:
                message= " is not valid";

        }
        System.out.println(message);

    }

}
