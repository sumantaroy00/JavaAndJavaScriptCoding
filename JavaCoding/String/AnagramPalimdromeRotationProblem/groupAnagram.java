package JavaCoding.String.AnagramPalimdromeRotationProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class groupAnagram {

    public static void main(String[] args) {
        
        String [] str = {"eat","tea","tan","ate","nat","bat"};

        Map<String, List<String>> map = new HashMap<>();
        for(String word : str){
         char[] chars = word.toCharArray();
         Arrays.sort(chars);
         String sortedword = new String(chars);

         if(!map.containsKey(sortedword)){
            map.put(sortedword,new ArrayList<>());
         }
          
          map.get(sortedword).add(word);
        }

        
       System.out.println(new ArrayList<>(map.values()));


    }
    
}
