package day35_inheritance.person;
//Super class--> parental class--> base class
public class Person {
//instance variable/fields can inherit
    String name;
    int age;
    String favoriteHobby;

//instance methods/actions can inherit
    public void talk(){
        System.out.println(name + " is talking");
    }
}
