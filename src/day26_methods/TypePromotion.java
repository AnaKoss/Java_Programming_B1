package day26_methods;

public class TypePromotion {
    public static void main(String[] args) {
        // byte, short, int, long, float, double
        use (2);
        use (3.3); //by default decimal # are double that is why it is calling the method with the parameter of double
        use(3.4f);
        use(12);
        use((double)3);
        short s =3;
        use(s);


    }

    public static void use (float f){
        System.out.println("calling float");
    }

    public static void use ( double d ){
        System.out.println("calling double");
    }

    public static void use ( long l){
        System.out.println("calling long");
    }



}
