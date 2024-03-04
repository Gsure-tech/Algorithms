package then;

import java.util.*;

public class CheckRepetition {
    public static void main(String[] args) {
      String str1 = "1a@££5gwrtw712876534";
      String str2 = "12345678";
      String str3 = "acvbngdretyu";
        List<String>myName = new ArrayList<>();
        System.out.println();
        System.out.println(str2.length());
       // System.out.println(uniqueCharacter(str2));
       // System.out.println(uniqueCharacter(str3));
    }
    private static boolean uniqueCharacter(String str) {
       for(int i =0; i< str.length(); i++){
           for(int j=i+1; j<str.length(); j++){
               if(str.charAt(i)==str.charAt(j)){
                   return false;
               }
           }
       }

        return true;
    }
    private static boolean uniqueCharacter2(String str) {
        List<Character> characterList = new ArrayList<>();
        List<String> myName = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            boolean contains = characterList.contains(ch);
            if(contains)
                return false;
            else {
                characterList.add(ch);
            }
        }
        return true;
    }
}
