package stream;
import java.util.*;
public class ArrayChallenge2 {

        public static int ArrayChallenge(String str) {
            String[] words = str.split(" ");
            Map<String, Integer> sortedWordCounts = new HashMap<>();
            int count = 0;

            for (String word : words) {
                char[] chars = word.toCharArray();
                Arrays.sort(chars);
                String sortedWord = new String(chars);

                sortedWordCounts.put(sortedWord, sortedWordCounts.getOrDefault(sortedWord, 0) + 1);
            }

            for (String sortedWord : sortedWordCounts.keySet()) {
                if (sortedWordCounts.get(sortedWord) > 1) {
                    count++;
                }
            }

            return count;
        }

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println(ArrayChallenge(s.nextLine()));
        }

}
