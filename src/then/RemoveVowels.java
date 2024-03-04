package then;

import java.util.Arrays;

public class RemoveVowels {

    public static void main(String[] args) {
            String str = "The man with the Big fat head";
        //System.out.println(disemvowel(str));
        char[]ch={'j','a','v','a'};
        //System.out.println(ch);
        String s = new String(ch);
        String me = new String("Welcome");
       // System.out.println(me);
        String he ="Sachin";
        String she = he.concat("Tendulka");
        String a = (new StringBuilder().append("Tendulka").append("Saachin")
                .toString());
        String s1 = new String("Hello");    //String 1
        String s2 = new String(" World");    //String 2
        String v = String.format("%s%s",s1,s2);   //String 3 to store the result
        //System.out.println(v);  //Displays result
        //System.out.println(a);

        String text= new String("Hello, My name is Sachin");
        /* Splits the sentence by the delimeter passed as an argument */
        String[] sentences = text.split("\\.");
        System.out.println(sentences.length);
        System.out.println(Arrays.toString(sentences));

        StringBuffer sb=new StringBuffer("Hello");
        sb.delete(0,3);
        System.out.println(sb);//prints Hlo
        StringBuilder him = new StringBuilder("Good day");
        System.out.println(him.reverse());

}

        public static String disemvowel(String str) {
            // Code away...
            


            String[]vowels={"A","E","I","O","U","a","e","i","o","u"};
            //char[]myChar = str.toCharArray();
            for(int i =0; i < str.length(); i++){
                if(vowels.equals(str.charAt(i))){
                    str=str.replace(vowels[i] ,"");
                }
            }
            return str;
        }
}
