import java.util.*;
public class DuplicateEncoder {
    public static void main(String[] args) {
        String letters ="President";
        System.out.println(encode(letters));
    }
    /*
    The goal of this exercise is to convert a string to a new
    string where each character in the new string is
     "(" if that character appears only once in the original
      string, or ")" if that character appears more than once
      in the original string. Ignore capitalization when
      determining if a character is a duplicate.
      "din"      =>  "((("
       "recede"   =>  "()()()"
       "Success"  =>  ")())())"
       "(( @"     =>  "))(("

     */
  static String encode(String word){
        Map<Character,Integer>myCount =new HashMap<>();
        //char myChangedword= word.toUpperCase();
        for(int i=0;i<word.length();i++){
            Character casedWord= word.toUpperCase().charAt(i);
            if(!myCount.containsKey(casedWord)){
                myCount.put(casedWord,1);
            }else{
                myCount.put(casedWord, myCount.get(casedWord)+1);
            }
        }
        String result="";
        for(int i=0; i<word.length();i++){
            Character casedWord= word.toUpperCase().charAt(i);
            if(myCount.get(casedWord)>1){
                result += ")";
            }else{
                result +="(";
            }
        }
        System.out.println(myCount);
        return result;
  }
}


//
//  public class DuplicateEncoder {
//    static String encode(String word){
//        StringBuilder sb = new StringBuilder();
//        word = word.toLowerCase();
//        for (char c : word.toCharArray()) {
//            if (word.indexOf(c) == word.lastIndexOf(c)) {
//                sb.append("(");
//            } else {
//                sb.append(")");
//            }
//        }
//        return sb.toString();
//    }
//}


//  public class DuplicateEncoder {
//    static String encode(String word){
//        String upperWord = word.toUpperCase();
//        String encodedWord = "";
//
//        for (int i = 0; i < upperWord.length(); i++) {
//            int count = 0;
//            for (int j = 0; j < upperWord.length(); j++) {
//                if (upperWord.charAt(i) == upperWord.charAt(j))
//                    count++;
//            }
//            if (count > 1) {
//                encodedWord += ")";
//            } else {
//                encodedWord += "(";
//            }
//        }
//        return encodedWord;
//    }
//  }

//  public class DuplicateEncoder {
//    static String encode(String word){
//        word = word.toLowerCase();
//        String result = "";
//        for (int i = 0; i < word.length(); ++i) {
//            char c = word.charAt(i);
//            result += word.lastIndexOf(c) == word.indexOf(c) ? "(" : ")";
//        }
//
//        return result;
//    }
//   }

