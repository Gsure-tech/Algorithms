import java.util.*;

public class MissingNumber {
    public static void main(String[] args) {
        System.out.println();
        int[] nums = {9,3, 4, 2, 8};
       // System.out.println(missingPositive(nums));
       // System.out.println(absentedNumber(nums));
        System.out.println(evenNumbers(nums).toString());
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

    private static int[]evenNumbers(int[]nums){
        int[]result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if(i%2 ==0){
                System.out.println(i);
            }

        }
        return result;
    }



    public int[] myNum(int[] pNums){
        int missingNumberz;
        Arrays.sort(pNums);

        if(pNums==null || pNums.length==0)  {
            return new int[]{1};
        }
        for(int i=0; i<pNums.length; i++){
            if (!pNums.equals(i)){
                return pNums;
            }
        }
        return pNums;
    }
        }
