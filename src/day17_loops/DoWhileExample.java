package day17_loops;




public class DoWhileExample {

    public static void main(String[] args) {


        do{
            System.out.println("this will print at least 1 time");
        }while (false);
        System.out.println("________________________");
       int a = 0;
       do {
           System.out.println(a);
           a++;
       }while (a<=10);

        System.out.println("________________________");

         int a1 = 0; //true
         do{
             System.out.println(a1); //that is why stop here
             a1=10;
         }while (a1 !=10); //false

    }


}
