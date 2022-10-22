package Codewar;

import java.util.*;
public class PowersOfTwo{
    public static long[] powersOfTwo(int n){
        /* Complete the function that takes a non-negative integer n as input,
         and returns a list of all the powers of 2 with
         the exponent ranging from 0 to n ( inclusive ).
             n = 0  ==> [1]        # [2^0]
             n = 1  ==> [1, 2]     # [2^0, 2^1]
             n = 2  ==> [1, 2, 4]  # [2^0, 2^1, 2^2]
         */
        // List<Long>result = new ArrayList<>();
        //TODO: Have fun
        long[] result = new long[n+1];
        if(n==0){
            result[0] = (long)Math.pow(2,0);
        }
        for(int i=0; i<=n; i++){
            // result.add((int)Math.pow(n,i));

            result[i] = (long)Math.pow(2,i);
        }
        //return new long[0];
        return result;
    }
}