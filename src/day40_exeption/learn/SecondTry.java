package day40_exeption.learn;

public class SecondTry {
    public static void main(String[] args) {

        try {
            String s = null;
            //System.out.println(s.length()); //exception
            System.out.println(s.length());

            int [] a = {1, 2, 3,4 };
            System.out.println(a[0]);

        }catch (NullPointerException e){
            System.out.println("Caught a null pointer exception");

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Caught the Array index out of Bounds");
        }
        System.out.println("Done");


    }
}
