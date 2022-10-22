package Codewar;



public class StringSplit {
   /* Complete the solution so that it splits the string
    into pairs of two characters.
    If the string contains an odd number of characters
    then it should replace the missing second character
    of the final pair with an underscore ('_').
    Examples:
            * 'abc' =>  ['ab', 'c_']
            * 'abcdef' => ['ab', 'cd', 'ef']*/
    public static String[] solution(String s) {
        //Write your code here
        String myStr= s;
        if(myStr.length() % 2 !=0) myStr +="_";
        String [] result= new String[myStr.length()/2];
        for(int i=0; i<myStr.length()/2 ; i++){
            result[i]=myStr.substring((i*2),(i*2)+2);
        }
        return result;
    }
}
