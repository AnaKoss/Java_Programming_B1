package day36_inheritance.hiding;

public class Soccer extends Sports{
//@Override
    public static void cheer(){
        System.out.println("Cheering from the CHILD class");
    }

    // it may look like we are overloading this method bit it is not bc the method is STATIC. Therefore, the one in the parent class get hidden when that method is called by the Child class.
}
