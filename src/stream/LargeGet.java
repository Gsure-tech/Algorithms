package stream;

import java.util.Arrays;

public class LargeGet {

/* Given a number num, two adjacent digits can be swapped if their parity is the same, that is, both are
 odd or both are even. For example, (5, 9) have the same parity, but (6,9) do not.
Find the largest number that can be created. The swap operation can be applied any number of times.
 */
        public static void main(String[] args) {
            System.out.println(getLargestNumber("7596801")); // Output: 9758601
            System.out.println(getLargestNumber("0082663")); // Output: 8662003
            System.out.println("Hello world");
        }

        public static String getLargestNumber(String num) {
            char[] digits = num.toCharArray();

            // Iterate over the digits and find adjacent pairs with the same parity
            for (int i = 0; i < digits.length - 1; i++) {
                if (isSameParity(digits[i], digits[i + 1])) {
                    // Swap the digits
                    char temp = digits[i];
                    digits[i] = digits[i + 1];
                    digits[i + 1] = temp;
                    i = -1; // Start from the beginning to re-check for more swaps
                }
            }

            return "Hello" + Arrays.toString(digits);
        }

        private static boolean isSameParity(char a, char b) {
            return (a - '0') % 2 == (b - '0') % 2;
        }


}
