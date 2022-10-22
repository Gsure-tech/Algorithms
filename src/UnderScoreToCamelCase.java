public class UnderScoreToCamelCase {
    public static void main(String[] args) {
        System.out.println(toCamelcase("Gud-day-my-boss"));
        String str = "Gud-Day-my-boss";
        String[] myStr = str.split("[-_]");
       // System.out.println(myStr.toString());
    }
   static String toCamelcase(String s){
       String camelCaseString;
       StringBuilder sb = new StringBuilder();
      // camelCaseString = sb.toString().replaceAll ("[-_]"," ");
            String []words = s.split("[-_]");
       for (int i = 0; i < words.length; i++) {
                if(i==0){
                    sb.append(words[i]);
                }
                if(i>=1){
                    if(Character.isUpperCase(words[i].charAt(0))){
                        sb.append(words[i] );
                    }
                    if(Character.isLowerCase(words[i].charAt(0))){
                        String tempString = words[i].substring(0,1).toUpperCase() +
                                words[i].substring(1);
                        sb.append(tempString);
                    }
                }
           }
       camelCaseString=sb.toString();
       return camelCaseString;
   };

}


