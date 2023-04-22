package day33_a_static;

public class Song {

    //data: name, length, artist, genre

    String name; //instance variables
    double length; //instance variables
    String artist; //instance variables
    String genre; //instance variables

// constructors: name, length

    public Song (String name, double length){
        this.name = name;
        this.length = length;
    }


// constructor: name, length, artist

    public Song (String name, double length, String artist){

        this(name, length); //!! constructor chaining!!!!!  // we use it instade-->  this.name = name; this.length = length;
        this.artist = artist;

    }


// constructor: name, length, artist, genre

    public Song (String name, double length, String artist, String genre){

        this(name, length, artist);
        this.genre = genre;

    }

    @Override
    public String toString() {
        return " Song:"  +
                "\nname: " + name +
                "\nlength: " + length +
                "\nartist: " + artist +
                "\ngenre: " + genre;
    }
}
