import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
public class PackArray {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);
        integers.add(7);
        integers.add(8);
       // 1, 2, 3, 4, 5, 6, 7, 8);
        System.out.println(packArray(integers));
    }

        public static int packArray(ArrayList<Integer> integers) {
            List<Integer>myInteger = new ArrayList<>();
            if(integers.size()==1){
                return integers.get(0);
            }

            for(int i=0; i<integers.size(); i++){
                myInteger.add((integers.get(i) + integers.get(i+1)));
                i++;
            }
            List<Integer>myResult = new ArrayList<>();
            for(int j=0; j<myInteger.size(); j++){
                myResult.add((myInteger.get(j) * (myInteger.get(j+1))));
                j++;
            }

            List<Integer>myFinalResult = new ArrayList<>();
            myFinalResult.add(myResult.get(0) + myResult.get(1));
            // System.out.println(myFinalResult);
            return myFinalResult.get(0);

    }
}
