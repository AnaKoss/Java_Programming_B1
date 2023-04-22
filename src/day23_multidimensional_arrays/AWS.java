package day23_multidimensional_arrays;

import java.util.Arrays;

public class AWS {
    public static void main(String[] args) {

       String server = "amazon";
       String zones = "us-east-1,us-west-1,us-west-2,us-west-3";

        String[] zonesArr = zones.split (",");
       System.out.println(Arrays.toString(zonesArr));
        for (int i = 0 ; i < zonesArr.length; i++) {
            //System.out.println(zonesArr[i]);
            //System.out.println(zonesArr[0]);
            System.out.println(server + " is begin deployed to the environment " + zonesArr[i] );
       }

        System.out.println("_________________");
        for (String eachZones :zonesArr ){
            System.out.println(server + " is begin deployed to the environment " + eachZones );
        }


    }
}
