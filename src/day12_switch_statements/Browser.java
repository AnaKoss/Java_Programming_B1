package day12_switch_statements;


import java.util.Scanner;

/*
ask the user to enter Browser type (single word)
ask a user to enter URL
chrome , edge,
safari, opera, firefox, mozilla
going into the url in chrome browser

 */
public class Browser {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your browser: ");

        String browser = input.next();

        System.out.println("Enter a URL: ");
        String url = input.next();

        switch(browser){
            case "Chrome":
            case "chrome":
            case "CHROME":
                System.out.println("Going into the " + url+ "  in " + browser + " browser");
            break;
            case "adge":
                System.out.println("Going into the " + url+ "  in " + browser + " browser");
                break;
            case "safari":
                System.out.println("Going into the " + url+ "  in " + browser + " browser");
                break;
            case "firefox":
                System.out.println("Going into the " + url+ "  in " + browser + " browser");
                break;
            default:
                System.out.println( browser+ " is invalid browser type");


        }
    }
}
