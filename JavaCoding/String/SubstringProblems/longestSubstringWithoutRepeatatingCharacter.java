package JavaCoding.String.SubstringProblems;

import java.util.*;

public class longestSubstringWithoutRepeatatingCharacter {


    public static void main(String[] args) {

       
        String str = "abcaedbb";
        int start =0, maxlen=0, maxstart =0;
        HashMap<Character , Integer> map = new HashMap<>();

   for(int i =0 ; i<str.length();i++){
        char ch = str.charAt(i);

        // If character is repeated, move start to the right of its last index
        if (map.containsKey(ch) && map.get(ch) >= start) {
            start = map.get(ch) + 1;
        }
        // Store the latest index of the character
        map.put(ch, i);

         // Update max length and starting index
        if (i - start + 1 > maxlen) {
            maxlen = i - start + 1;
            maxstart = start;
        }

   }

    String output = str.substring(maxstart, maxstart + maxlen);

    System.out.println(output);
    
        
    }
    
}
