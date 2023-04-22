package day33_b_encapsulation.traffic;

public class TrafficLight {

    private String color;
    public TrafficLight (String color){
        this.color = color;
    }

    public void setColor(String color) { //return void, instance
        if (color.toLowerCase().equals("Yellow")) {
            this.color = color;
        }
        if (color.toLowerCase().equals("Red")) {
            this.color = color;
        }
        if (color.toLowerCase().equals("green")) {
            this.color = color;
        }


    }

    public String getColor(){
        return color;
    }

}
