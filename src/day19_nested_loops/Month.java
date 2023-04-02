package day19_nested_loops;

public class Month {
    public static void main(String[] args) {

        System.out.println("Day " + 1);

        for (int i = 1; i <=7; i++) {
            System.out.println("Day " + i);
        }
         // for (int day = 1; day <=7; day++) {
        //    System.out.println("Day " + day);
       // }

        for (int week = 1; week <=4; week++) {
            System.out.println("Week:  " + week);
            for (int day = 1; day <=7; day++) {
                System.out.println("day " + day);
            }
        }




    }
}
