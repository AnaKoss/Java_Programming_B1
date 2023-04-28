package day35_inheritance.book;

public class AudioBook extends Book {

    double duration;
    String narrator;
    public void listen(){
        System.out.println("listening the audio book " + title + " " + author);
    }

}
