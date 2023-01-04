package Codewar;

import java.util.*;

public class CountingDuplicates {

    /* Count the number of Duplicates
    Write a function that will return the count of distinct case-insensitive alphabetic
    characters and numeric digits that occur more than once in the input string.
    The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.
    Example
    "abcde" -> 0 # no characters repeats more than once
    "aabbcde" -> 2 # 'a' and 'b'
    "aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
    "indivisibility" -> 1 # 'i' occurs six times
    "Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
    "aA11" -> 2 # 'a' and '1'
    "ABBA" -> 2 # 'A' and 'B' each occur twice
    */


    public static int duplicateCount(String text) {
        // Write your code here
        int count = 0;
        Map<Character, Integer> myText = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            Character casedText = text.toUpperCase().charAt(i);
            if (!myText.containsKey(casedText)) {
                myText.put(casedText, 1);
            } else {
                myText.put(casedText, myText.get(casedText) + 1);
            }
        }
        for (Map.Entry<Character, Integer> e : myText.entrySet()) {
            //for(int i=0; i<myText.size(); i++){
            if (e.getValue() > 1) count++;
        }
        return count;
    }

}