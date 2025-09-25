package JavaCoding.String.AnagramPalimdromeRotationProblem;

import java.util.*;

public class allAnagramInString {

    /*Given two strings s and p, return all the start indices of p's anagrams in s.
You may return the answer in any order. */

    public static void main(String[] args) {

       String s = "cbaebabacd";
       String p = "abc";


   /* 
   Key Ideas:
   Use a sliding window of size equal to p.length().
   Maintain character frequency maps for p and current window in s.
   Compare frequency maps using an array (faster than HashMap for small alphabets).
*/ 
        
     int len = p.length(); 
     char[] pArr = p.toLowerCase().toCharArray();
     Arrays.sort(pArr);
     String sortedP = new String(pArr);

     List<Integer> list = new ArrayList<>();

     for(int i =0 ; i <= s.length() - len;i++){

            String temp = s.substring(i, i + len).toLowerCase();
            char[] tempArr = temp.toCharArray();
            Arrays.sort(tempArr);
            String sortedTemp = new String(tempArr);
         
         if(sortedP.equals(sortedTemp)){
           list.add(i);

         }

     }

     System.out.println(list);

    }
    
}
