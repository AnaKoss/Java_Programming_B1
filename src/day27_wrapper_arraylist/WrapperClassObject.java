package day27_wrapper_arraylist;

public class WrapperClassObject {

    public static void main(String[] args) {

int a =5;  //primitive datatype
Integer a2 = 6;  // autoboxing: primitive ---> wrapper object //object datatype
        int a4 = a2;   //unboxing:   wrapper --> primitive
//Integer a3 = new Integer (7); // redundant == deprecated
        //byte b = (byte)200;  //narrowing - implicit casting
        byte b = 2;
        Byte b2 = 20; // by default it --> int // auto boxing
        System.out.println(a);
        System.out.println(a2);
        //System.out.println(a3);
//whole num by default ---> int
//decimal num by default ---> double
    }




}
