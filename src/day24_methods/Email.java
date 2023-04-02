package day24_methods;
/*
create a method that take 2 arguments as name and domain
and print out the email address name out of the name and domain
 */

public class Email {

    public static void generateEmail (String name, String domain){
        String email = name.toLowerCase()+ "@" + domain.toLowerCase() + ".com";
        System.out.println("Your email address: " + email);
    }
    public static void main(String[] args) {
        generateEmail("Sky", "Gmail");//Sky@gmail.com
        generateEmail("fall", "yahoo");


        }
    }



