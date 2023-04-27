package day34_b_encapsulation.square;

public class UseSquare {

    public static void main(String[] args) {

        Square obj1 = new Square(22);
        //obj.side = 22;
        obj1 = new Square(44);

        Square obj2 = new Square(-33);

        //System.out.println(obj2.side); // since side is privet i can not access this

        System.out.println(obj2.getSide());//it would default value -> 0 print. (-33)

        Square obj3 = new Square(55);
        System.out.println(obj3.getSide());

        System.out.println(obj3.calculateArea());
        System.out.println(obj3.calculatePerimeter());

    }
}
