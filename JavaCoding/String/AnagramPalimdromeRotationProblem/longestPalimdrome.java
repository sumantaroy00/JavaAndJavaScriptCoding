package JavaCoding.String.AnagramPalimdromeRotationProblem;

import java.util.*;

public class longestPalimdrome {

    public static void main(String[] args) {
        String s = "abccccdd";

        HashMap<Character , Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }


        StringBuilder half = new StringBuilder();

        String middle = "";

        for(Map.Entry<Character,Integer> m : map.entrySet())
        {
            
            char ch = m.getKey();
            int count = m.getValue();

            // If character count is even, use all in halves
           if(count%2==0){

                for(int i=0;i<count/2;i++){
                    half.append(ch);
                }
           }
           else{
            // If odd, use count - 1 in halves, and possibly one in middle
                for (int i = 0; i < count / 2; i++) {
                    half.append(ch);
                }// Only one middle character allowed
                if (middle.isEmpty()) {  // Only one middle character allowed
                    middle = String.valueOf(ch);
                }

           }
        }

        String halfStr = half.toString();
        String reverseHalf = new StringBuilder(halfStr).reverse().toString();

        String palindrome = halfStr + middle + reverseHalf;

        System.out.println(palindrome);
        System.out.println(palindrome.length());

    }
    
}
