package day36_inheritance.hiding;

public class CallMethods {

    public static void main(String[] args) {

        A obj1 = new A();
        obj1.instanceMethod();
        A.staticMethod();
        System.out.println("_________");

        B obj2 = new B();
        obj2.instanceMethod();
        B.staticMethod();






    }
}
