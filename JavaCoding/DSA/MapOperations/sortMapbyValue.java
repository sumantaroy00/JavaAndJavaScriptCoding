package JavaCoding.DSA.MapOperations;
 import java.util.*;
import java.util.stream.Collectors;
public class sortMapbyValue {

    public static void main(String[] args) {
        

        Map<String , Integer> map = new HashMap<>();

        map.put("suma",6);
        map.put("debo",3);
        map.put("sumo",9);
        map.put("deba",4);

       //1.Using List of Entries + Collections.sort() + Comparator

                    List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());

                    Collections.sort(list , new Comparator<Map.Entry<String , Integer>>(){
                            @Override
                            public int compare(Map.Entry<String , Integer> e1, Map.Entry<String , Integer> e2){
                                return e1.getValue().compareTo(e2.getValue());
                               
                            }
                    });

                    Map<String , Integer> sortedByValue = new HashMap<>();
                    for (Map.Entry<String, Integer> entry : list)
                     {
                    sortedByValue.put(entry.getKey(), entry.getValue());
                     }


       //2. Sort using Lambda
                   list.sort((e1, e2) -> e1.getValue().compareTo(e2.getValue()));  // Ascending
                // list.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));  // Descending

                // Create LinkedHashMap
                   Map<String, Integer> sortedByValue1 = new LinkedHashMap<>();
                   for (Map.Entry<String, Integer> entry : list) {
                       sortedByValue1.put(entry.getKey(), entry.getValue());
                    }
   

                    System.out.println(sortedByValue);
                    System.out.println(sortedByValue1);


      //3️⃣ Using Stream API

                        Map<String, Integer> sortedByValue2 = map.entrySet()
                            .stream()
                            .sorted(Map.Entry.comparingByValue())  // Ascending
                            // .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())  // Descending
                            .collect(Collectors.toMap(
                                Map.Entry::getKey,
                                Map.Entry::getValue,
                                (oldValue, newValue) -> oldValue,
                                LinkedHashMap::new
                            ));

                        System.out.println(sortedByValue2);


     //4️⃣ Using TreeSet of Entries (Less common)

                        Set<Map.Entry<String, Integer>> sortedEntries = new TreeSet<>(
                            Comparator.comparing(Map.Entry::getValue)
                        );

                        sortedEntries.addAll(map.entrySet());

                        // Optional: Build LinkedHashMap if needed
                        Map<String, Integer> sortedByValue3 = new LinkedHashMap<>();
                        for (Map.Entry<String, Integer> entry : sortedEntries) {
                            sortedByValue.put(entry.getKey(), entry.getValue());
                        }

                        System.out.println(sortedByValue3);

                    }
             
                    
}
