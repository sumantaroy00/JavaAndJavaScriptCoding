package JavaCoding.String.StringManupulation;
import java.util.*;

public class WordReverseRemoveDuplicateCharacter {

    public static void main(String[] args) {
        
        String str  = "summann12 rh12rhoy" ;
        String [] words = str.split(" ");
        StringBuilder result = new StringBuilder();


        for(String word : words)
         {
           String reverse = new StringBuilder(word).reverse().toString();
           StringBuilder cleaned = new StringBuilder();
           Set<Character> seen = new HashSet<>();

           for (char c : reverse.toCharArray()) 
           {
                if (Character.isDigit(c)) {
                    c = '@';
                }
                if (!seen.contains(c)) {
                    seen.add(c);
                    cleaned.append(c);
                }
           }

             // Append the cleaned word
            result.append(cleaned).append(" ");

         }

        System.out.println(result.toString());





    }
    
}
