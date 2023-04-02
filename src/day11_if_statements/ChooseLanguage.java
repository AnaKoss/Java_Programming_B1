package day11_if_statements;

import java.util.Scanner;

public class ChooseLanguage {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a number based on the language they wanted to use: \n\t1- English\n\t2- Spanish\n\t3- Turkish\n\t4- Russian\n\t5- French\n\tEnter number: ");

        int languageNum = input.nextInt();

        if( languageNum == 1){
            System.out.println("Hello, thank you for the call");
        }else if (languageNum ==2){
            System.out.println("Hola, gracias");
        } else if ( languageNum ==3){
            System.out.println("Merhaba, aradiginiz icin tesekkurler");
        } else if (languageNum ==4) {
            System.out.println("privet, spasibo");
        }else if (languageNum==5){
            System.out.println("Bongoure");
            }else if (languageNum ==6){
            System.out.println("Tez de gorum, Konturnm gurtardi");
        } else {
            System.out.println("Invalid input");
        }
        System.out.println();

    }


}
