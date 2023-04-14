package day29_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class JobTitle {
    public static void main(String[] args) {

        ArrayList<String> jobs = new ArrayList<>();


       // jobs.addAll(Arrays.asList("SDET", "Quality Engineer", "Automation Engineer", "Quality Assurance"));
        jobs.addAll(Arrays.asList("SDET", "QE", "AE", "QA", "BA", "PO", "AM", "PM"));
        System.out.println("Original: " + jobs);
        ArrayList<String> job1 = new ArrayList<>(jobs); // created new ArrayList object by copying the values from jobs ArrayList
// this method removes all given values from the list if they match, it needs for not changes anything in the original object.
    job1.removeAll(Arrays.asList("BA", "PO", "SM"));
        System.out.println(job1);

//retainAll()--> This method will keep al the given values and remove rest
        ArrayList<String> job2 = new ArrayList<>(jobs); // copy original by adding (jobs)!!!!
        job2.retainAll(Arrays.asList("SDET", "QA", "AE", "QE")); // If change to "Qe" it retains the exact matches
        System.out.println(job2);

//containsALL();--> this method will check if ArrayList contains all given elements and will return boolean value
        ArrayList<String> job3 = new ArrayList<>(jobs);
        boolean result1 = job3.containsAll(Arrays.asList("QA", "BA", "PO"));
        boolean result2 = job3.containsAll(Arrays.asList("QA", "BA", "PO)"));
        System.out.println(result1);
        System.out.println(result2);

    }

}
