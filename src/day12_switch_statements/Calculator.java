package day12_switch_statements;

import java.util.Scanner;

/*
declare and asiign 2 number variables
decrale and assign a char variable for an operator
create a calculator based on the operaror picked
+: add num1 and num2
-: minus num1 ans num2
*: multiply num1 and num2
/: divide num1 and num2
ex:

 */
public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        double num1 = input.nextDouble();
        System.out.println("Select operator: \n\t+\n\t-\n\t*\n\t/\n\t%\n\t Enter");
        String operator = input.next();
        System.out.println("Enter 2nd number: ");
        double num2 = input.nextDouble();
boolean isValidOperator= true;
double result=0;
        switch(operator){
            case "+":
                result= num1 + num2;
            break;
            case "-": // if num1> num2 --> num1 - num2 : else num2 -num1
                if(num1>num2){
                    result = num1 -num2;
                }else{
                    result = num2 - num1;
                }
            break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if(num2!=0){
                    result = num1/num2;
            }else {
                    System.out.println("Cannot divide by 0");
                }
                break;
            case "%":
                if(num2!=0){
                    result = num1 % num2;
                }else{
                    System.out.println("Invalid");
                }
                break;
            default:
                System.out.println(operator + " Is not a valid for this calculator");
                isValidOperator = false;
        }
        if (isValidOperator){
            System.out.println(num1 + " " + operator+ " "+ num2+ " = " + result);
        }

    }


}
