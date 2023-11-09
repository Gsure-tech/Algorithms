package codewar;

public class BitCounting {
    public static void main(String[] args) {
        System.out.println( countBits(6));
    }




    public static int countBits(int n){
        // Show me the code!
        String binary = "";
        int count =0;
        while(n>0){
            binary =n%2 + binary;
            n=n/2;
        }
        System.out.println(binary);

        char[]myChar = binary.toCharArray();

        for(int i=0; i<myChar.length; i++){
            if(myChar[i]=='1'){
                count ++;
            }
        }
        return count;
    }
}