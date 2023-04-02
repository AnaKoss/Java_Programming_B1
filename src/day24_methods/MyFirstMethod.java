package day24_methods;

public class MyFirstMethod {
    public static void sayHello (){

        System.out.println("Hello Loop.");
    }
    public static void sayHello5(){ // it can be everywhere
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }
    }

    public static void main(String[] args) {
        sayHello();

        System.out.println();

        for (int i = 0; i < 3 ; i++) {
            sayHello();
        }

        System.out.println("___________");
        sayHello5();

        System.out.println("____________");
        sayHello5();
    }




}
