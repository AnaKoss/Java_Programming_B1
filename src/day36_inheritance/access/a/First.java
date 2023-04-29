package day36_inheritance.access.a;

public class First {
    public int one = 1;
    protected int two = 2;
    int three = 3; //default
    private int four = 4; //avalable only in the class
    public static void main(String[] args) {
        //everything is in the SAME CLASS

        First obj = new First(); // can access for all 4 objects
        System.out.println(obj.one);
        System.out.println(obj.two);
        System.out.println(obj.three);
        System.out.println(obj.four);
    }
}
