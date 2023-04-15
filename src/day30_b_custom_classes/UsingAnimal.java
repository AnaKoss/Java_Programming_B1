package day30_b_custom_classes;

public class UsingAnimal {

    public static void main(String[] args) {

        Animal bird = new Animal();
        bird.population = 1000000;
        bird.species = "Bird";


        //when we use just the object name tp print the information it will by default call the toString() method, but we need to have toString method() in the c lass.
        System.out.println(bird);
        System.out.println("_______________");
        System.out.println(bird.toString()); // normally if you have toString method declare, we do not need to call the method this way.

        System.out.println(bird);  // This by default will call the toString() method but that method has to be declared in Animal class

        bird.fly();


    }

}
