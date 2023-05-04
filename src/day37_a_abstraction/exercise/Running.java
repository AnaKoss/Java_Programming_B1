package day37_a_abstraction.exercise;

public class Running extends Exercise {

    public Running (String name){//we should call constructor FIRST
        super(name);
    }
@Override
    public void performExercise(){
        System.out.println("Running for fun");
    }
@Override
    public int getCaloriesBurned(int minutes) {
        return minutes *5;
    }


}
