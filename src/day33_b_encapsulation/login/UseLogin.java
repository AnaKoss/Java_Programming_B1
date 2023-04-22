package day33_b_encapsulation.login;

public class UseLogin {
    public static void main(String[] args) {

        Login obj1 = new Login();

        //obj1.username = "tester"; // cannot access private instance variable
        //obj1.password = "1234";// cannot access private instance variable


        obj1.setUsername("test");
       obj1.setPassword("123");
        System.out.println(obj1);

obj1.setPassword("123456788");
        System.out.println("Ogj1 password is: " + obj1.getPassword("test"));

        System.out.println(obj1.getUsername());


        Login obj2 = new Login();
        obj2.setUsername("Anna");
        obj2.setPassword("2022Ukraine_@");
        //System.out.println(obj2.password);
        System.out.println(obj2.getPassword("Anna"));
        System.out.println(obj2.getPassword("Sky"));





    }

}
