package day39_a_polymorphism.book;
/*
create a concrete class JavaTextBook
- inherits EBook
-declare a fun variable
-override all abstract methods
 */
public class JavaTextBook extends EBook{

    boolean fun;

    @Override
    public void read() {
        System.out.println("Reading");

    }

    @Override
    public void downloadable() {
        System.out.println("Downloading");

    }

    @Override
    public void open() {
        System.out.println("Opening");

    }
}
/*
    int i = 5;
    double d = i;  // upcasting - implicitly
making automatically , that is why we do need to write  double d =(double) i;

    double d1 = 5.0;
    int i2 = (int) d1;  // down casting
//byte, short, int, long, float, double
 */

/*
       child class -- access
       super class

       (super class)child class // upcasting
       (sub class)super class //  downcast

 */