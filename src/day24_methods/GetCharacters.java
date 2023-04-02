package day24_methods;

public class GetCharacters {

    public static void printAtoZ(){
        for (int i = 'A'; i <= 'Z'; i++) {
            System.out.print((char)i + " ");
        }
        System.out.println();
    }
    public static void printaToz (){
        for (int i = 'a'; i <='z'; i++) {
            System.out.print((char) i + " ");
        }
        System.out.println();
    }
    public static void printZtoA (){
        for (int i = 'Z'; i >= 'A'; i--) {
            System.out.print((char) i + " ");
        }
        System.out.println();
    }
    public static void print0To9 (){
        for (int i = 0; i <=9 ; i++) {
            System.out.print(i+ " ");
        }
        System.out.println();
    }
    public static void print9To0(){
        for (int i = 9; i >=0 ; i--) {
            System.out.print(i+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        printAtoZ();
        printaToz();
        printZtoA();
        print0To9();
        print9To0();
    }


}
