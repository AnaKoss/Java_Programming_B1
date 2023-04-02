package day24_methods;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        sayHelloToWhom();
        sayHello("Anna");
        sayHello("Annna");
        sayHello("Annnna");

        Scanner input = new Scanner (System.in);
        System.out.println("Enter the name: ");
        String userName = input.next();
        sayHello(userName);
    }

    public static void sayHelloToWhom (){
        System.out.println("Hello Ana. Hope are you good.");

    }
public static void sayHello(String name){
    System.out.println("Hello " + name + "! Hope are you good.");
}




}
