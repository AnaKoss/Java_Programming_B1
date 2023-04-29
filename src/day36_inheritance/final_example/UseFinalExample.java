package day36_inheritance.final_example;

public class UseFinalExample {

    public static void main(String[] args) {

        System.out.println(FinalExample.PLANET);

//FinalExample.PLANEt = "Mars";
        FinalExample obj1 = new FinalExample(20);
        System.out.println(obj1.a);
        System.out.println(obj1.b);


        //obj1.a = 30;// since it is FINAL we can NOT change the value
        //obj1b = 40;// since it is FINAL we can NOT change the value

        System.out.println("_______________________");
        FinalExample obj2 = new FinalExample(30);
        System.out.println(obj2.a);
        System.out.println(obj2.b);
    }

}
