package day32_custom_classes;

public class ChainExample {
    public ChainExample(){
        System.out.println("first");
    }

    public ChainExample(int i){
        this();
        System.out.println("second");
    }

    public ChainExample(String s){
        this(12);
        System.out.println("third");
    }

    public ChainExample(double d){
        this("Test");
        System.out.println("fourth");
    }



}
