package then;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
public class Week4Algorithm {

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
