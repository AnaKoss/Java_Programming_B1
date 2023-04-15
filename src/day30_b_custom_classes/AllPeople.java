package day30_b_custom_classes;

public class AllPeople {
    public static void main(String[] args) {

        Person person1 = new Person();
        Person person2 = new Person();

// assign the instance variables with values for each object
        person1.name = "Ana";
        person2.name = "Helen";

        // printing each objects own copy of the name


        System.out.println("______________");
        System.out.println(person1.name);
        person1.age= 30;
        person1.height = 1.80;
        person1.isMarried = false;
        person1.lastName ="Koss";
        System.out.println(person1.lastName);
        System.out.println(person1.age);
        System.out.println(person1.height);
        System.out.println(person1.isMarried);

        System.out.println("______________");

        System.out.println(person2.name);
        System.out.println(person2.lastName);
        System.out.println(person2.age);
        System.out.println(person2.height);
    }
}