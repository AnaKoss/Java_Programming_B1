package day37_a_abstraction.car;
//mu runner class
public class Garage {
    public static void main(String[] args) {
        //car class is ABSTRACT class , that is why we can not create object
       // Car obj1 = new Car(); // we can not create object
        Toyota t1 = new Toyota();
        t1.start();
        System.out.println("________");
        Honda h1 = new Honda();
        h1.start();
        // both Honda and Toyota are the FIRST NON ABSTRACT child classes of CAR parent abstract class. Since they are NON ABSTRACT, I can create the object. Also, had to implement the start() method.
        System.out.println("________");
        Tesla ts1 = new Tesla();
        ts1.start(); // comes from grandparent class
        ts1.charging();// comes from parent class
        System.out.println("_________");
        Rivian r1 = new Rivian();
        r1.start();
        r1.charging();
    }
}
