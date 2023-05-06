package day39_a_polymorphism.clothes;
//runner class
public class Store {
    public static void main(String[] args) {

       //all possible references

        //the reference is --> ITSELF
       TShirt t1 = new TShirt();
       t1.wear();

       //the reference is ---> super class
       Clothes t2 = new TShirt();
       t2.wear();


       //TShert class does not implement HasHood --> meaning there is not relationship
       //HasHood t3 = new TShirt(); // there are no relation between HasHood

        System.out.println();
        Jacket j = new Jacket();
        j. wear();
        j.putOnHood();

        //the reference is ---> super class
        Clothes j2 = new Jacket();
        j2.wear();
        //since the reference is not interface, I canNOT access this method
        //j2.putOnHood();//we do not have access


        //the reference is --> Interface
        HasHood j3 = new Jacket();
        //since the reference is NOT SUPER CLASS, I canNOT access this method
        //j3.wear();
        j3.putOnHood();


        //the reference is --> object class
        Object o = new Jacket();
        //since the reference is NOT object class I canNOT access these methods
        //o.wear();
        //o.putOnHood();
        o.toString(); // since it is object class , i can reach

        System.out.println("_____");

        //relation is --> interface
        HasHood t4 = new Jacket(); //have relation



    }

}
