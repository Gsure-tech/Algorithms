package Codewar;

import java.lang.StringBuilder;
class Solution{
    /*Complete the method/function so that it converts dash/underscore
    delimited words into camel casing. The first word within the output
    should be capitalized only if the original word was capitalized
    (known as Upper Camel Case, also often referred to as Pascal case).

    Examples
"the-stealth-warrior" gets converted to "theStealthWarrior"
"The_Stealth_Warrior" gets converted to "TheStealthWarrior"*/
    static String toCamelCase(String s){
        if(s.length()==0)return "";
        String result = s.substring(0,1);


        for(int i=1; i<s.length(); i++){
            if(!Character.isLetter(s.charAt(i))){
                result+=s.substring(i+1,i+2).toUpperCase();
                i++;
            } else{
                result +=s.substring(i,i+1);
            }
        }
        return result;
    }
}