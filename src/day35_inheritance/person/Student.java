package day35_inheritance.person;
//class child --> subclass
//student is a person
public class Student extends Person{

    int fullLevel;


    public void study(){
        System.out.println(name + " is studying");
    }

}
