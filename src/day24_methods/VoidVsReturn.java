package day24_methods;

public class VoidVsReturn {
    public static void sayHello(){
        System.out.println("Hello");
    }

    public static String sayBye(){
        return "Bye";
    }


    public static void main(String[] args) {
        sayHello();
        System.out.println("_____");
        sayBye(); // it just retirning the String "bye", ans don't doing anything with it.
        System.out.println("_____");
        System.out.println(sayBye()); // the method sayBye(); returns a String- "bye" and then I am printing it out.


    }

}
