package then;

public class Binary {
    public static void main(String[] args) {
        int number = 10;
        int bit =0;
        String binaryNum ="";
        while (number !=0){
            bit= number%2;
            binaryNum += bit;
            number /=2;
        }
        System.out.println(binaryNum);
        String reversedBin ="";


         char [] binChar = binaryNum.toCharArray();
        for (int i= binChar.length-1; i >=0 ; i--) {
         reversedBin += binChar[i];
        }
        System.out.println(reversedBin);
        int binSum =0;
        for (int i = 0; i <binChar.length; i++) {
                binSum+= Character.getNumericValue(binChar[i]);
        }
        System.out.println(binSum);
    }
}


// public class Program {
//    public static void main(String[ ] args) {
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        System.out.print(Converter.toBinary(x));
//    }
//}
//public  class Converter{
//public static String  toBinary(int num){
//        String binary="";
//        while(num>0){
//            binary = (num%2) + binary;
//            num /= 2;
//        }
//        return binary;
//    }
//}