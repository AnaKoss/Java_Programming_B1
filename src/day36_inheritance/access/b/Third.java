package day36_inheritance.access.b;

import day36_inheritance.access.a.First;
//DIfferent class and Different package
public class Third {
    public static void main(String[] args) {
        //Third obj = new Third();//this third class obj can only access to ITS OWN class instance

        First obj = new First();
        System.out.println(obj.one); // public and accessible in all project
       // System.out.println(obj.two); //protected. sicne there is no inheritance, it is not accessible in different package
       // System.out.println(obj.three); //default. it will be only accessible in the SAME package
       // System.out.println(obj.four); //private. It is only available in the SANE class.
    }
}
