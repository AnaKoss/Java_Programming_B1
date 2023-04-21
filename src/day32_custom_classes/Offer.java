package day32_custom_classes;

public class Offer {

    /*
    create instance variables
    location, company, salary, is full time, number of PTO
     */

    String location;
    String company;
    double salary;
    boolean isFullTime;
    int numOfPTO;

    public Offer ( String company, String location){
        this.company = company;
        this.location = location;

    }

    public Offer ( String company, String location, double salary){
        this.company = company;
        this.location = location;
        this.salary = salary;

    }

    public Offer ( String company, String location, double salary, boolean isFullTime, int numOfPTO){
        this.company = company;
        this.location = location;
        this.salary = salary;
        this.isFullTime = isFullTime;
        this.numOfPTO = numOfPTO;

    }

    @Override
    public String toString() {
        return "Offer: " +
                "\nlocation: " + location +
                "\nCompany: " + company  +
                "\nSalary: $" + salary +
                "\nIs Full Time: " + isFullTime +
                "\nNum of PTO: " + numOfPTO;
    }
}
