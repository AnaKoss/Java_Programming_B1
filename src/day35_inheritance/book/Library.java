package day35_inheritance.book;
//runner class
public class Library {
    public static void main(String[] args) {

        Book book = new Book();
        // this book object can reach 6 instances

        EBook ebook = new EBook();
        //this EBOOK object can reach 6 instance variables from Super class only
        // 2 instance variables and 1 instance method from its own class.
        ebook.size = 20;
        ebook.pages = 1035;
        ebook.title = "Soft Skills";
        ebook.author = "Nadir";
        ebook.read();


        AudioBook abook = new AudioBook();
        abook.duration = 2.4;
        abook.narrator = "Anna Sky";
        abook.title = "Java";
        abook.author = "James Gosling";
        abook.listen();


    }
}
