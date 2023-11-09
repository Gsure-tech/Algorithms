package codewar;
import java.util.*;
public class LengthOfMissingArray {
    public static void main(String[] args) {
      Integer [][]myArr ={{2,4},{3,5,1,6,9},{1,3,4}};
        System.out.println(getLengthOfMissingArray(myArr));
    }
        public static int getLengthOfMissingArray(Object[][] arrayOfArrays)
        {
            int m=0;
            List<Integer>myLength = new ArrayList<>();
            for(int i=0; i<arrayOfArrays.length; i++){
                myLength.add(arrayOfArrays[i].length);
            }
            Collections.sort(myLength);
            List<Integer>myCount = new ArrayList<>();
            //int myCount;
            myCount.add(myLength.size());

            System.out.println(myCount.get(0));
            System.out.println("hello");
            List<Integer>myNumbers = new ArrayList<>();
            for(int j = 0; j< myCount.get(0); j++){
                myNumbers.add(myCount.get(j));
            }
            for(int k=0; k<myLength.size(); k++){
                if(!myLength.get(k).equals(myNumbers))
                    m=myLength.get(k);
                    return myLength.get(k);
            }
                return m;
    }
}
