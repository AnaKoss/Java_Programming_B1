package day40_exeption;

import java.util.InputMismatchException;

public class TryWithInheritance {
    public static void main(String[] args) {

        try{

// you should to go from the most specific to less(from small to big) , otherwise they will be never print
        }catch(IndexOutOfBoundsException e){    // first more specific

        }catch(RuntimeException e){            // second more specific

        }catch(Exception e){                //thirst more specific

        }

/*
    What is the possible reference for IndexOutOfBoundsException
        IndexOutOfBoundsException e1 = new IndexOutOfBoundsException();
        RuntimeException e2 = new IndexOutOfBoundsException();
        Exception e3 = new IndexOutOfBoundsException();

 */


    }
}
