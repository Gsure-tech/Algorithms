public class MaxiNum {
    public static void main(String[] args) {
      //  System.out.println(maxiNumb(new int[]{5, 6, 3,  7}).toString());
     int [] nums= new int[]{5, 6, 3,10,14, 7};
//        int maxNum = nums[0];
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i]> maxNum){
//                maxNum=nums[i];
        maxiNumb(nums);
        System.out.println(maxiNumb(nums));
    }

    private static int[] maxiNumb(int[] nums) {
       int maxNum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]> maxNum){
                maxNum=nums[i];
            }
        }
       return new int[]{maxNum};
     }


        static String toCamelCase(String s) {
            String[] words = s.split("[-_]");
            StringBuilder sb = new StringBuilder(words[0]);
            for (int i = 1; i < words.length; i++)
                sb.append(words[i].substring(0, 1).toUpperCase()).append(words[i].substring(1));
            return sb.toString();
        }
    }

