package day43_map;
/*
declare 2 instance variable: name, gpa, id
create constractor that accepts 3 arguments
and initialize them in constructor
Make a toString method to String the info about object
 */
public class Student {

        String name;
        double gpa;
        int id;

    public Student(String name, double gpa, int id) {
        this.name = name;
        this.gpa = gpa;
        this.id = id;
    }
}
