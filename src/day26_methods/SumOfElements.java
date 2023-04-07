package day26_methods;

public class SumOfElements {
    // varargs ---> variable arguments
    /*create the method which accepts an int array and returns the sum of the elements.
     */
public static int sumOfElements ( int [] arr){
    int sum = 0;
    for ( int each: arr){
        sum +=each;
    }
    return sum;
}
public static int method ( int num, int ...arr){                                       //#4
    System.out.println("testing");
    return 1;
}
    public static int sumOfElements2 ( int ... arr){                                     //#5
        int sum = 0;
        for ( int each: arr){
            sum +=each;
        }
        return sum;
    }
    public static void main(String[] args) {
     int []arr = {12,34,23,12,65};                                                      //#2
     int []arr2 = new int []{34,23,456,756};                                            //#3
        System.out.println(                    sumOfElements(arr)   );                  //#2
        System.out.println(                    sumOfElements(arr2)  );                  //#3
        System.out.println(sumOfElements(      new int [] { 12,34,56,786,85})     );


        System.out.println( sumOfElements2(1,2,3,4,5)); // 15                     // #5
        System.out.println( method(3,23,43,234,67,234)); // 15                                           // # 4

    }
}
