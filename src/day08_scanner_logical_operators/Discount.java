package day08_scanner_logical_operators;

public class Discount {

    public static void main(String[] args) {

        // declare & assign
        //is it the weekend
        //are you a teacher
        //are you a police officer
        //are you a firefighter
        //do you get a discount?
        // Must be a weekend day and you must be one of the given professions



        boolean getDiscount;
        boolean isWeekend = true;
        boolean teacher = false;
        boolean policeOfficer = true;
        boolean firefighter = false;



        getDiscount = isWeekend && (teacher || policeOfficer || firefighter);



        System.out.println("Do you get discount? "+ getDiscount );


    }
}
