package day36_inheritance.hiding;

public class Game {
    public static void main(String[] args) {
        Soccer obj1 = new Soccer();
       //obj1.cheer;
        Soccer.cheer();
        Sports.cheer();
    }
}
