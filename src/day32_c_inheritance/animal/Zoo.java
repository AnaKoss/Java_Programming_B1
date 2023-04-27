package day32_c_inheritance.animal;

public class Zoo {

    public static void main(String[] args) {

        Dog d = new Dog();
        d.numOfLegs = 4;
        Kang k = new Kang();
        k.numOfLegs = 2;


        //d.bark(); //polymorphism
    }
}
