package JavaCoding.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class arraylistBasic {

    public static void main(String[] args) {

        //Remove Duplicates from an ArrayList

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4, 1, 5));
          list = new ArrayList<>(new LinkedHashSet<>(list));
          System.out.println(list); //

          // Reverse an ArrayList

             ArrayList<String> list1 = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
             Collections.reverse(list1);
             System.out.println(list1);


        //     Sort an ArrayList

        Collections.sort(list);
        System.out.println(list); // Output: [1, 2, 3, 5, 8]
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list); //
        
        //Convert an ArrayList to an Array and Vice Versa
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Java", "Python", "C++"));
        String[] array = list2.toArray(new String[0]);
        System.out.println(Arrays.toString(array));

        // Convert Array to ArrayList
        List<String> newList = Arrays.asList(array);
        System.out.println(newList);

        //Merge Two ArrayLists Without Duplicates
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(3, 4, 5, 6));

        Set<Integer> set = new HashSet<>();
        set.addAll(list3);
        set.addAll(list4);

        ArrayList<Integer> mergedList = new ArrayList<>(set);
        System.out.println(mergedList);


        //Find the Most Frequent Element in an ArrayList

        ArrayList<Integer> list5 = new ArrayList<>(Arrays.asList(1, 3, 3, 2, 2, 2, 4, 5));
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : list5) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0, mostFrequent = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                mostFrequent = entry.getKey();
            }
            System.out.println("Most Frequent: " + mostFrequent);
        }
     
        //7. Remove All Occurrences of a Given Element

        ArrayList<Integer> list6 = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4, 2, 5));
        list6.removeIf(num -> num == 2);
        System.out.println(list);

       //Check If Two ArrayLists Are Equal
        ArrayList<Integer> list7 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> list8 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(list7.equals(list8)); // Output: true

        //ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Collections.shuffle(list);
        System.out.println(list); // Output: Random order

    }


        
}
 

