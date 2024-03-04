package then;

import java.util.Arrays;

public class SumArray {
    public static void main(String[] args) {
        int [] myArr = {4,2,6,1};
//        int sum=0;
//        for (int i = 0; i < myArr.length; i++) {
//                 sum=sum + myArr[i];
//        }
        System.out.println(simpleArraySum(myArr));
        int [] arr={8,10,3,5,7};
        Arrays.sort(arr);
        int maxi = arr.length-1;
        System.out.println(arr[maxi]);
    }

    static int simpleArraySum (int[]arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum + arr[i];
        }
        return sum;
    }
}
