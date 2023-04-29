package day36_inheritance.access.b;

import day36_inheritance.access.a.First;
//DIFFERENT Package and DIFFERENT class but with INHERITANCE relation
public class Fourth extends First {
    public static void main(String[] args) {
        //Fourth obj = new Fourth();
        // This Fourth class obj can ONLY access to iit OWN class instance.
        First obj = new First();
        System.out.println(obj.one);
//        System.out.println(obj.two);
//        System.out.println(obj.three);
//        System.out.println(obj.four);
        // The above Line 12, 13, 14 are not accessible withe the Parent class obj in the Child class


        Fourth obj2 = new Fourth();
        System.out.println(obj2.one);
        System.out.println(obj2.two);//since there is INHERITANCE between FOUrth class and FIRST class , the object of FOURTH class inherince all the accessible fields and methods of its parents class. in this case, since the child class is in a different package. i am still avle to access the protected and public variable/methods

        //System.out.println(obj2.three); //is default. It will be ONLY accessible in the SAME package
        //System.out.println(obj2.four); //private. It is ONLY available in the SAME class


    }
}
