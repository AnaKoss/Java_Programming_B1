package day36_inheritance.lyft;

public class Lyft {
    //parent class
    String driver;
    public Lyft (String driver){
    this.driver= driver;
    }
    public double calculateRate(int miles){
        return miles * 3.75;
    }

}
