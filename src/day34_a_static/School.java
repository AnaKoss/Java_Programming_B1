package day34_a_static;

public class School {
    public static void main(String[] args) {
        //create an object that has to parameters: name, groupNumber
    LoopAcademyStudent student1 = new LoopAcademyStudent("Anna", 2); //default constractor
    LoopAcademyStudent student2 = new LoopAcademyStudent("Hellen", 1);

        System.out.println("__________");

        LoopAcademyStudent.printInfo();

        System.out.println("____________");


        LoopAcademyStudent.printInfo();

        System.out.println("______________");
        System.out.println(student1);
        System.out.println(student2);
    }
}
