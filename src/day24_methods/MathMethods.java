package day24_methods;

public class MathMethods {
    //add
    //sub
    //multiplication
    //division

    public static void add(int num1, int num2){
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }
public static void minus (double num1, double num2){
    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
}

public static void divide( double num1 , double num2 ){

        if(num2 ==0){
            System.out.println("Out of math rules! can not be divided by 0");
        }else{
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        }

}
    public static void main(String[] args) {
        add(20, 23);
        minus(11.2, 11.1);
        minus(15, 5);
        divide(21,7);
        divide(20,0);
    }


}
