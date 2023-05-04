package day37_a_abstraction.car;
//super class
public abstract class Car {
//ABSTRACT METHOD has to be in abstract Class
    //you can NOT have abstract methods is NOT ABSTRACT CLASS
    public abstract void start(); //do not have {} body !!!

//abstract method in abstract class ONLY!!!!

    /*
    SO FAR:
    -ABSTRACT methods does NOT have body {}
    -Abstract method tell WHAT it does but not HOW
    -Abstract method HAS TO BE in abstract class
    -Whatever class extends ABSTRACT class HAS TO implement ABSTRACT class
    -The FIRST NON-ABSTRACT class HAS TO IMPLEMENT all the MULTI-LEVEL abstract inheritance.
     -Abstract Class can NOT be instantiated / object of it can NOT be created
     -we may have NON -ABSTRACT fields and methods in Abstract class
     -the FIRST NON ABSTRACT Class  is also called CONCRETE class.
     */
}
