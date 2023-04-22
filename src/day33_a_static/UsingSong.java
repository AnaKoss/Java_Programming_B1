package day33_a_static;

import java.util.ArrayList;
import java.util.Collections;

public class UsingSong {
    public static void main(String[] args) {

     Song song1 = new Song("Waka Waka", 3.02);
     Song song2 = new Song("Yesterday", 3.12, "Beatles");
     Song song3 = new Song("Thunder", 3.24, "Imagine Dragon", "Rock");


        ArrayList<Song> songList  = new  ArrayList<>();
        songList.add(song1);
        System.out.println("________");
        songList.add(song2);
        System.out.println("________");
        songList.add(song3);

        System.out.println(songList);
        System.out.println("++++++++++");
        for ( Song each: songList) {
            System.out.println("___________");
            System.out.println(each);
        }
        System.out.println("*****************");

        //can you remove the object which does not have genre

        songList.removeIf(each-> each.genre == null);
        System.out.println(songList);

        System.out.println("_______________");

songList.add(song1);
songList.add(song2);
// can you remove the object what has length longer than 3.1
        songList.removeIf(each -> each.length >3.1);
        System.out.println(songList);


    }
}
