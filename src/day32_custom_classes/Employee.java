package day32_custom_classes;

public class Employee {
    // name, id, job title, salary ( instance variables of field)

    String name;
    int id;
    String jobTitle;
    double salary;

    /*
    constructor
    create a constructor that creates an Employee object with the name and job title
    create a constructor that creates an Employee object with name, id, job title, salaty

     */
    public Employee(String name, String jobTitle) {
        this.name = name;
        this.jobTitle = jobTitle;

    }

    public Employee(String name, int id, String jobTitle, double salaty) {
        this.name = name;
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salaty;
    }

    /*
    method :
    - goToMeeting ()
            when this method is called print:
            $name is going to a meeting

    - toString()
            print all the information

     */
    public void goToMeeting() {
        System.out.println(name + " is going to a meeting");

    }
    //public void goToMeeting(String name){
    //     System.out.println(this.name + " and " + name + " is going to a meeting"); // this.-> represent of object
    // }

    public String toString() {

String msg = "";

        msg += "\nName: " + name;
        msg +="\nJob Title: " + jobTitle;
        msg += "\nID: " + ((id != 0 )? id : "ID to be determined");
        msg += "\nSalary: $" + ((salary != 0.0 )? salary :"Salary to be determined" );

        return msg;


    }

}
