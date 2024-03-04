package then;

public class ReverseString {
    public static void main(String[] args) {
        String myString = "Hello World!";
        String myStringReplace = myString.replace("l","b");
        System.out.println(myStringReplace);

        char[] myChar = myString.toCharArray();

        for (int i = myChar.length - 1; i >= 0; i--) {
            System.out.print(myChar[i]);
        }

        StringBuilder stringBuilder = new StringBuilder("Reverse this for me");
        stringBuilder.reverse();
        System.out.println(stringBuilder);

        System.out.println();
        int[] myInt = {3, 7, 9, 4};
        for (int i = myInt.length - 1; i >= 0; i--) {
            System.out.print(myInt[i]);
        }
        System.out.println();
        String [] ourString ={"Hello World!","My","World"};

        for (int i = ourString.length-1; i >=0 ; i--) {
            System.out.print(ourString[i] +" ");
        }


        System.out.println();
        String theirString ="HELLO WORLD!";
        char[] ourChar = theirString.toCharArray();
        for (int i = ourChar.length-1; i >=0 ; i--) {
            System.out.print(ourChar[i]);

        }
    }
}