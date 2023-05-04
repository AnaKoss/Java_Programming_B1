package day37_a_abstraction.exercise;
//runner class
public class Gym {
    public static void main(String[] args) {
        //even if you have a constructor we still cannot
       // Exercise obj = new Exercise();


        Running obj2 = new Running("Running");
        System.out.println(obj2.name);
        obj2.performExercise();
        System.out.println(obj2.getCaloriesBurned(10));
    }
}
