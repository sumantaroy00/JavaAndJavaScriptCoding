package JavaCoding.String.AnagramPalimdromeRotationProblem;

/*Given a pattern and a string s, find if s follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s. Specifically:

Each letter in pattern maps to exactly one unique word in s.
Each unique word in s maps to exactly one letter in pattern.
No two letters map to the same word, and no two words map to the same letter.*/

import java.util.*;

public class WordPattern {

    public static void main(String[] args) {
        
       String pattern = "abba";
       String s = "dog cat cat dog";

       Map<Character , String> map = new HashMap<>();

       char [] ch = pattern.toCharArray();
       String [] str = s.split(" ");

       if(ch.length!=str.length){
        System.out.println("Not Matched");
       }

       for(int i = 0 ; i<ch.length;i++){

              if(map.containsKey(ch[i])){
                  if(!map.get(ch[i]).equals(str[i])){
                    System.out.println("Not Matched");
                  }
              }

             else if(map.containsKey(str[i])){
                System.out.println("Not Matched");
             }


        map.put(ch[i],str[i]);

       }
       System.out.println("Word Pattern Matched");
    }
    
}
