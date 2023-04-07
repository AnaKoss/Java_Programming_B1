package day26_methods;

public class ArrayIndexOf {

    public static void main(String[] args) {

        String str = "loop";
        int index = str.indexOf("l");


        int []arr = {3,1,546,43,23};
        int num =546;
        System.out.println(indexOf(arr, num));
        System.out.println(indexOf2(arr, num));
        System.out.println(indexOf(new String []{"Tom", "Ana", "loop", "Jerry"},"Ana" ));
    }
     public static int indexOf2 (int [] arr, int num){
         for (int i = 0; i < arr.length; i++) {
             if (arr[i] ==num){
                 return i;
             }
         }
        return -1;
     }

    public static int indexOf (String [] arr, String word) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(word)) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOf (int []arr, int num){
        int locationOfElement = 0;
        for ( int each : arr){     //{3,1,546,43,23};    num = 3
            if ( each == num){     // 0 1  2   3  4
                return locationOfElement;
            }else {
                locationOfElement++;    // updating
            }
        }
        return -1; // if user give num which is not in the array
    }


}
