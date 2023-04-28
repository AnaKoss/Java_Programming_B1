package day35_inheritance.person;

public class Building {
    public static void main(String[] args) {

        Person person = new Person();
        person.name = "James Bond";
        person.age = 30;
        person.favoriteHobby = "spy";
person.talk();
//person.study(); //Since this belong specifically to the child Parent class object can NOT access.

        Student student = new Student();
        student.name = "Tom Jerry";
        student.age = 20;
        student.favoriteHobby = "cheat";
student.talk();
student.fullLevel = 100;
student.study();

    }
}
