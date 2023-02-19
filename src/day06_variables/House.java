package day06_variables;

    /*
    Create a class House
    create a main method
    - Each the datatype you feel is most appropriate for each variable.
    - Create the following variables:
        house type, number of bedrooms, number of bathrooms, number of kitchens, is there a basement?, is there an attic, is there a pool, is the house for sale?, cost of the house, address, zipcode, is a park near by, Rating of surrounding school districts (out of 5),
    - Print each variable with a message with the value
        Ex: The number of bedrooms is: 4
            The number of bathrooms is: 3
     */

public class House {
    public static void main(String[] args) {

        String houseType = "Single House";
        int numberOfBedrooms = 5;
        int numberOfBathrooms = 5;
        int numberOfKitchens = 2;
        boolean isThereABasement = false;
        boolean isThereAnAttic = false;
        boolean isTherePool = true;
        boolean isItOnSale = false;
        int zipcode = 12345;
        boolean hasPark = true;
        double schoolRating = 4.6;
        double costOfHouse = 1_000_000.99;
        String address = "123 Central Ave";

        String houseInfo = "The " + houseType + " an "+ address + "," + zipcode + " costs $" + costOfHouse + "\nThe " + houseType + " has " + numberOfBedrooms + " bedroom, " + numberOfBathrooms + " bathrooms, " + numberOfKitchens + " kitchens" + "\nIt also includes a basement: "+ isThereABasement + ", has an attic: "+ isThereAnAttic + ", has a pool: " + isTherePool + ", is no sale: "+ isItOnSale + ", has Park: "+ hasPark + "\nThe schools is the area have a ratting of "+ schoolRating;
        System.out.println(houseInfo);




    }
}
