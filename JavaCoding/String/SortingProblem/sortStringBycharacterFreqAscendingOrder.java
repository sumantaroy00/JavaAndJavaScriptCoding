package JavaCoding.String.SortingProblem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class sortStringBycharacterFreqAscendingOrder {


       public static void main(String[] args) {


    String str = "tree";

    HashMap<Character,Integer> map = new HashMap<>();
    StringBuffer result = new StringBuffer();
    char [] ch = str.toCharArray();

        for(char c : ch){
           map.put(c,map.getOrDefault(c,0)+1);
        }

        List<Character> list = new ArrayList<>(map.keySet());
        list.sort((ob1,ob2)-> map.get(ob1) - map.get(ob2));

        for(char ch1:  list){

                result.append(ch1);
        }

      System.out.println(result.toString());

   }
    
    
}
    
