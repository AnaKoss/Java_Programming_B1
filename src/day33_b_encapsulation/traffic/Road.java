package day33_b_encapsulation.traffic;

public class Road {

    public static void main(String[] args) {

        TrafficLight light= new TrafficLight("Yellow");
        //System.out.println(light.color); by default will be null

        //light.color = "red"; // also by default

        TrafficLight light2 = new TrafficLight("grey");
        System.out.println(light2.getColor()); //


        TrafficLight light3 = new TrafficLight("Green");
        System.out.println(light3.getColor()); //






    }


}
