package day44_map;

public class UsingBrowser {

    public static void main(String[] args) {


        Browser browser = Browser.CHROME;


switch (browser) {
    case EDGE:
        System.out.println("Opening EDGE browser");
        break;
    case CHROME:
        System.out.println("Opening CHROME browser");
        break;
    case SAFARI:
        System.out.println("Opening SAFARI browser");
        break;
    case FIREFOX:
        System.out.println("Opening FIREFOX browser");
        break;
}







    }

}
