import java.util.*;

public class MissingNumber {
    public static void main(String[] args) {
        System.out.println();
        int[] nums = {9,3, 4, 2, 8};
       // System.out.println(missingPositive(nums));
        System.out.println(absentedNumber(nums));
//
//        if(nums==null || nums.length==0)  {
//            System.out.println(1);
//        }
//        for(int i=0; i<nums.length; i++){
//            if (!nums.equals(i)){
//                missing = nums;
//
//            }
//        }
//        System.out.println(nums);

        //  System.out.println(missingNumber(num).toString());
    }


    public static int missingPositive(int[] nums) {
        Arrays.sort(nums);

        int value = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == value)
                value++;
            //System.out.println(value);

        }
        return value;
    }

    private static int absentedNumber(int[]nums){
        Arrays.sort(nums);

        int missingNumber = 1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == missingNumber)
             missingNumber ++;
        }
        return missingNumber;
    }
}
//        int missingNumberz;
//        Arrays.sort(nums);
//
//        if(nums==null || nums.length==0)  {
//            return new int[]{1};
//        }
//        for(int i=0; i<nums.length; i++){
//            if (!nums.equals(i)){
//                return nums;
//            }
//        }
//        return nums;
//    }

