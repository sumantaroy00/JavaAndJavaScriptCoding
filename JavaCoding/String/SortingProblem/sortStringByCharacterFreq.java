package JavaCoding.String.SortingProblem;

import java.util.*;

public class sortStringByCharacterFreq {
/*Part 1: List<Character> list = new ArrayList<>(map.keySet());
map.keySet() returns a Set<Character> — all unique characters from the string.

new ArrayList<>(...) converts that Set into a mutable list so it can be sorted.

Now list contains all characters from the string (without duplicates).

🔹 Part 2: list.sort((ob1, ob2) -> map.get(ob2) - map.get(ob1));
This is a custom comparator used to sort the characters by frequency in descending order.

Here's what's happening:
list.sort(...) sorts the list using a lambda expression.

(ob1, ob2) are two characters being compared.

map.get(ob1) and map.get(ob2) give you the frequency of those characters.

map.get(ob2) - map.get(ob1) means:

If result is positive, ob2 has higher frequency → ob2 comes before ob1.

If result is negative, ob1 has higher frequency → ob1 comes before ob2.

If result is zero, they have the same frequency → maintain their relative order. */

    public static void main(String[] args) {


    String str = "tree";

    HashMap<Character,Integer> map = new HashMap<>();
    StringBuffer result = new StringBuffer();
    

       char [] ch = str.toCharArray();

        for(char c : ch){
           map.put(c,map.getOrDefault(c,0)+1);
        }

        List<Character> list = new ArrayList<>(map.keySet());
        list.sort((ob1,ob2)-> map.get(ob2) - map.get(ob1));

        for(char ch1:  list){

            for(int i=0;i<map.get(ch1);i++){
                result.append(ch1);
            }
        }

      System.out.println(result.toString());

   }
    
    
}
