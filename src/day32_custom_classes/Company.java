package day32_custom_classes;

public class Company {

    public static void main(String[] args) {

       // making object

       Employee emp1 = new Employee("Anna", "SDET");
       Employee emp2 = new Employee("Helen", 123, "QE", 125000.00);

        System.out.println(emp1);
        System.out.println("_________");
        System.out.println(emp2);


    }

}
