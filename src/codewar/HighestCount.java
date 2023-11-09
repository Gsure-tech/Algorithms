package codewar;
import java.util.*;
public class HighestCount {

    public class Kata {



        public String high(String s) {
            Map<Character, Integer> count = new HashMap<>();




            int index =0;
            int nums = 1;
            for(char arr = 'a'  ; arr <= 'z'; arr++){
                count.put(arr,nums);
                nums++;
            }
            String[] sentence = s.split(" ");

            List<Integer> test = new ArrayList<>();
            int result = 0; //34
            int result2 = 0; //30
            for(int j = 0; j < sentence.length; j++){
                for(int k = 0; k < sentence[j].length() ; k++){
                    result2 +=count.get(sentence[j].charAt(k));

                }

                test.add(result2);


                if(result2 > result) {result = result2;}
                result2 = 0;

                index = test.indexOf(result);

                // [man, i, need , ...]

                // [30, 15 , 34 , ....]


            }


            return sentence[index];
        }



    }
}
