package then;

public class Maskify {
/*
Usually when you buy something, you're asked whether your
 credit card number, phone number or answer to your most secret question is
  still correct. However, since someone could look over your shoulder,
  you don't want that shown on your screen. Instead, we mask it.
Your task is to write a function maskify, which changes all but the last four
characters into '#'.
"4556364607935616" --> "############5616"
     "64607935616" -->      "#######5616"
               "1" -->                "1"
                "" -->                 ""
// "What was the name of your first pet?"
"Skippy" --> "##ippy"
"Nananananananananananananananana Batman!"
-->
"####################################man!"
 */

    public static String maskify(String str) {
        // throw new UnsupportedOperationException("Unimplemented");
        String result ="";
        String hash="#";
        if(str.length()>4){
            for(int i=0; i<str.length()-4; i++){
                result += hash;
            }
            result = result.concat(str.substring(str.length()-4,str.length())) ;
        }else if(str.length()==1){
            result= str.substring(0,1);
        }else if(str.length()==2){
            result = str.substring(0,2);
        }else if(str.length()==3){
            result = str.substring(0,3);
        }else if(str.length()==4){
            result = str.substring(0,4);
        }

        System.out.println(str);
        System.out.println(result);
        return result;
    }
}

//public class Maskify {
//    public static String maskify(String str) {
//        if (str.length() <= 4) return str;
//        String result = "";
//        for (int i = 0; i < str.length()-4; i++) {
//            result += "#";
//        }
//        return result + str.substring(str.length()-4);
//    }
//}