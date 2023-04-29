package day36_inheritance.access.a;

public class Second {
    //DIFFERENT CLASS but the SAME package
    public static void main(String[] args) {

        //Second obj = new Second();//this second class obj can only access to ITS OWN class instance

        First obj = new First();
        System.out.println(obj.one); //public
        System.out.println(obj.two); //protected bc in the SAME package!!!
        System.out.println(obj.three);
       // System.out.println(obj.four); //since e the instance variable is private it is only accessible in the class level. IF we want to access then we can do it indirectly by using Setters and Getters
    }
}
