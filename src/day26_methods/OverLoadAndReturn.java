package day26_methods;

public class OverLoadAndReturn {

    public static void method (){
        System.out.println("Just printing by default");
    }
         //return type being different does not mean that they are overload
        // chamging the return type does not mean we overloaded the method
       // public static int method (){
      //   System.out.println("Just printing by default");
     //   return 1;
    //      }

         public static int method (int num){ //overload check name and everything what in the ()!!!
             System.out.println("Just printing by default");
             return 1;
         }
}
