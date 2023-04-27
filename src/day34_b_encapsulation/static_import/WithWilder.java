package day34_b_encapsulation.static_import;
import static my_util.ArrayUtil.*;

import static java.util.Arrays.*;


public class WithWilder {
    public static void main(String[] args) {

        int [] a = {1, 2, 3, 4, 5};

        sort(a); // since we have done the static import we can call the method by the name only.
       // System.out.println(toString(a)); --> toString method is NOT static , that is why we can use by itself

        minNumInArrWithSort(new int []{4,5,6,7});




    }

}
