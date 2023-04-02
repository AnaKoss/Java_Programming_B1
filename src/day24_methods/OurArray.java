package day24_methods;


/*
all will accept array argument
create
 */
public class OurArray {

    public static void main(String[] args) {
        int[] nums = {12, 32, 43, 65, 77, 654, 543, 7899, 2};
        int [] nums2 = new int [] { 1, 2, 3, 4, 5, 6, 7};

firstElemInArr(nums);
lastElemInArr(nums);
printEachElemInArr(nums);
findMiddle(nums);
        System.out.println();

printEachElemInArr(nums2);
        System.out.println();
printEachElemInArr(new int [] { 234, 34, 3345, 4567});
    }
    public static void firstElemInArr(int[] nums){
        System.out.println("First element: " + nums[0]);
    }
    public static void lastElemInArr(int[] nums){
        System.out.println("Last element: " + nums[nums.length -1]);
    }

    public static void printEachElemInArr (int[] userArr) {
        for (int each : userArr) {
            System.out.print(each + " ");
        }
    }

        public static void findMiddle(int [] nums){
            if (nums.length %2 ==0){
                System.out.print("\nMy middle are: " + nums[nums.length/2-1] + " and " + nums [nums.length/2]);
            }else{
                System.out.print("\nMy middle are: " + nums[nums.length/2]);
        }

    }


}
