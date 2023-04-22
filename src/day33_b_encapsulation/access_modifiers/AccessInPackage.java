package day33_b_encapsulation.access_modifiers;

public class AccessInPackage {

    public static void main(String[] args) {

        AccessModifiers obj = new AccessModifiers();

        System.out.println(obj.a);// public bc
        System.out.println(obj.b);// in the same package , able to reach default
        //System.out.println(obj.c); // since it is different class and private is not accecable


        //System.out.println(AccessModifiers.z); // bc it id private
        System.out.println(AccessModifiers.y);




    }

}
