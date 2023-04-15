package day30_b_custom_classes;

public class Animal {

    String species;
    long population;
    public void fly () {
        System.out.println(species + " are flying ");
    }

   /* @Override
    public String toString() {   // double click - Generate - to string , it will generate for you
        return "Animal{" +
                "species='" + species + '\'' +
                ", population=" + population +
                '}';
    }
    */

    public String toString(){
        String print = "Scecies " + species + "\nPopulation " + population;
        //print += "population";

        return print;


    }
}
