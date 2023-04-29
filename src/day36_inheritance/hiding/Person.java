package day36_inheritance.hiding;

public class Person {
    String name ="Tom Jerry";

}
class Child extends Person{
   // if the instance below was commented out, the object of the class will get the name instance from Parent class
    // Since we have it and we call it with the child class object, the one in the Parent is hidden for Child class objec.
    String name ="James Gosling";

}


class Runner{
    public static void main(String []args){
        Person person = new Person();
        System.out.println(person.name);

        System.out.println("__________");
        Child child = new Child();
        System.out.println(child.name);
    }
}