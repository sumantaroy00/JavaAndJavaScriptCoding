package JavaCoding.DSA.MapOperations;

import java.util.*;
import java.util.stream.Collectors;

public class sortMapbyKeys {

    public static void main(String[] args) {
        
   //1.TreeMap - a.)Ascending
        HashMap<String , Integer> map = new HashMap<>();

        map.put("organe",50);
        map.put("Banana",10);
        map.put("Apple",20);
        Map<String , Integer> sortedMap = new TreeMap<>(map);
        System.out.println(sortedMap);

    //1.TreeMap  - b.)Decending
        Map<String , Integer> sortedMapReverse = new TreeMap<>(Collections.reverseOrder());
        sortedMapReverse.putAll(map);
        System.out.println(sortedMapReverse);


     //2.Using list and collections 

          Map<String, Integer> newmap = new HashMap<>();
          newmap.put("C", 30);
          newmap.put("A", 10);
          newmap.put("B", 20);

          List<String> list = new ArrayList<>(newmap.keySet());
          Collections.sort(list);                   
          System.out.println(list);
           
    //3. Using Stream API 

           Map<String, Integer> streamMap = new HashMap<>();
            streamMap.put("banana", 2);
            streamMap.put("apple", 5);
            streamMap.put("cherry", 1);
        
            Map<String, Integer> sortedMap1 = streamMap.entrySet()
                                             
                          .stream()
                          .sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(
                           Map.Entry::getKey,
                           Map.Entry::getValue,
                           (oldValue, newValue) -> oldValue,
                           LinkedHashMap::new
                            ));

             System.out.println(sortedMap1);



    //4. Sort Map by Key using Comparator

                   Map<String, Integer> map11 = new HashMap<>();
                    map11.put("debo", 2);
                    map11.put("suma", 5);
                    map11.put("deba", 1);


                  // Get keys into List
                   List<String> keys = new ArrayList<>(map11.keySet());
                  // Sort using comparator 
                   Collections.sort(keys, new Comparator<String>(){

                         @Override
                         public int compare(String o1, String o2) {
                            return o1.compareTo(o2);  // for descending: o2.compareTo(o1)
                         }

                   });

                 // Build LinkedHashMap
                  Map<String, Integer> sortedMap11 = new LinkedHashMap<>();
                  for( String key : keys){

                       sortedMap11.put(key,map11.get(key));
                  }

                  System.out.println(sortedMap11);

     //5.Same Example using Lambda Comparator (Java 8+)

                  List<String> keys1 = new ArrayList<>(map.keySet());

                        // Sort using Comparator (Lambda)
                        keys1.sort((k1, k2) -> k1.compareTo(k2));   // Ascending
                        // keys.sort((k1, k2) -> k2.compareTo(k1));  // Descending

                        // Build LinkedHashMap
                        Map<String, Integer> sortedMap12 = new LinkedHashMap<>();
                        for (String key : keys1) {
                            sortedMap12.put(key, map.get(key));
                        }

                        System.out.println(sortedMap12);
                        
                            }
                            
    
}
