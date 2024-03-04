package then;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       //Reverse a String
        String myString = "Hey my guy";
        System.out.println(reverseWithStringBuilder(myString));
        String str ="Hello world";
        char[]arr = str.toCharArray();
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print( arr[i]);
        }

        //char[]arr=str.toCharArray();
        String[]myArrayString={"A","B","C"};
        List<String> myList = Arrays.asList(myArrayString);
        Collections.reverse(myList);
        String[]reversedArray = myList.toArray(myArrayString);
        System.out.println(" " + Arrays.toString(reversedArray));


    }
    static String reverseWithStringBuilder(String myString){
        return new StringBuilder(myString).reverse().toString();
    }

}