package day06_variables;

public class TypeCasting {
    public static void main(String[] args) {

        byte b = 40;
        int i = b;
        int i2 = 100;
       // byte b2 = i2;
        byte b2 = (byte) i2;
        byte b3 = 100;

        System.out.println("b2:" + b2);
        System.out.println("b3:" + b3);


        int i3 = 130;
        byte b4 = (byte)i3;
        System.out.println("b4:" + b4);


        char letter1 = 65;
        char letter2 = 'A';
        System.out.println("letter1 " + letter1);
        System.out.println("letter2 " + letter2);

        byte aa = 5;
        char bb = (char)aa;

        System.out.println("bb:" + bb);

        double d = 50;
        System.out.println("d:"   + d);

        int i13 = (int)d;
        System.out.println("i13: " + i13);







    }


}
