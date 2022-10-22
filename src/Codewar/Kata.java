package Codewar;

import java.util.*;
public class Kata {

    public static void main(String[] args) {
        /*You will be given an array of numbers. You have to sort the
        odd numbers in ascending order while leaving the
        even numbers at their original positions.*/
        int [] arr ={2,5,7,3,4,11,9};
        System.out.println(Arrays.toString(sortArray(arr)));
        int result = (int) Math.pow(4,3);
        System.out.println(result);
    }
    public static int[] sortArray(int[] array) {
        List<Integer>odd =new ArrayList<>();
        for(int i=0; i<array.length; i++) {
            if (array[i] % 2 != 0) {
                odd.add(array[i]);
            }
        }
           Collections.sort(odd);
            int k=0;
            for(int j=0; j<array.length; j++){
                if(array[j]%2 ==1){
                    array[j] = odd.get(k);
                    k++;
                }
            }

        return array;
    }
}
