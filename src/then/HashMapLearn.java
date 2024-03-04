package then;

import java.util.*;
public class HashMapLearn {
    public static void main(String[] args) {
         HashMap <String, Integer> empIds = new HashMap<>();
       // Map<String, Integer> myNumber = new HashMap<>();
        empIds.put("John",12345);
        empIds.put("Carl",54321);
        empIds.put("Jerry",8675309);
        //System.out.println(empIds);

//        System.out.println(empIds.get("Carl"));
//        System.out.println(empIds.containsKey("Jerry"));
//        System.out.println(empIds.containsValue(12345));
//        empIds.put("Johney", 98765);
//        System.out.println(empIds);
//        empIds.remove("John", 98765);
//        System.out.println(empIds.values());
//        for (int i = 0; i < empIds.size(); i++) {
//            System.out.println(empIds.get(i));
//        }
//        for(var s: empIds.keySet()){
//            System.out.print(s + " " + empIds.get(s) + " ");// System.out.println(empIds.get(s));
//        }
        for(Map.Entry<String,Integer> set: empIds.entrySet()){
          //  System.out.println(set);
        }
        Map<Integer, String> car = new HashMap<>();
        car.put(1,"Lexus");
        car.put(2,"Range");
        car.put(3,"Lexus");

        Map<Integer, String> newCar = new HashMap<>();

        for(Map.Entry<Integer, String> set: car.entrySet()){
            if(!newCar.containsValue(set.getValue())){
                newCar.put(set.getKey(),set.getValue());
            }
        }
        for(Map.Entry<Integer, String> oldCars: newCar.entrySet()){
            //System.out.println(oldCars);
        }
        for(String s:empIds.keySet()){
            System.out.println(empIds.get(s));
            System.out.println(s);
        }
//        for(var s: empIds.values()){
//            System.out.print(s + " " );
//            System.out.println(empIds.get(s));
//        }
        //System.out.println(empIds);
    }

}