package day14_string;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

 /*
        Ask the user to enter a username
        make sure the username is in lowercase

        Ask the user to enter a password
        check if the password is more or equal to 8 characters long

        valid system password: "loopcamp"

        -> if the entered password matches the system password
            logged in

            otherwise print:

            invalid password
*/

        Scanner input = new Scanner (System.in);
        System.out.println("Enter your username: ");
        String userName = input.next();
       userName = userName.toLowerCase();
        System.out.println("Enter your password: ");
        String password = input.next();
        // method --> .length();
        int passwordLength = password.length();
        System.out.println(passwordLength);

        if ( passwordLength>= 8 && userName.equals("loopcamp")) {
            System.out.println("you are logged in as "+ userName);
        }else{
           if (passwordLength<8){
               System.out.println("password length does not match");
           }
           if (!userName.equals("loopcamp")){
               System.out.println("invalid username");
           }

        }


    }


}
