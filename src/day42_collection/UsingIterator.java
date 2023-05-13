package day42_collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class UsingIterator {
    public static void main(String[] args) {

        ArrayList<String> list  = new ArrayList<>();
        list.add("james");
        list.add("java");
        list.add("Gosling");
        list.add("Selenium");
        System.out.println(list);

        Iterator<String> it = list.iterator();

        //it.next();
        System.out.println(it.next());//move the pin/cursor to the beginning of the next element and get that element
        System.out.println(it.next());//move the pin/cursor to the beginning of the next element and get that element
        System.out.println(it.next());
        System.out.println(it.next());
       // System.out.println(it.next());//exception

try{
    it.next();
}catch (NoSuchElementException e){
    System.out.println(e.getMessage());
}


    }
}
