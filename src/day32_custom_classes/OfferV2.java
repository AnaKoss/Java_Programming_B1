package day32_custom_classes;

public class OfferV2 {

     /*
    create instance variables
    location, company, salary, is full time, number of PTO
     */

    String location;
    String company;
    double salary;
    boolean isFullTime;
    int numOfPTO;

    public OfferV2 ( String company, String location){
        this.company = company;
        this.location = location;

    }

    public OfferV2 ( String company, String location, double salary){
       // this.company = company;
        //this.location = location;

        this(company, location);
        this.salary = salary;

    }

    public OfferV2 ( String company, String location, double salary, boolean isFullTime, int numOfPTO){
       // this.company = company;
       // this.location = location;
       // this.salary = salary;

        this(company, location, salary); // using this() keyword we call another constructor which instantiate the values on instance variables

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
