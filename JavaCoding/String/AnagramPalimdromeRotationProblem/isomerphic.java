package JavaCoding.String.AnagramPalimdromeRotationProblem;
 import java.util.*;

public class isomerphic {

    public static void main(String[] args) {

        System.out.println("egg, add: " + isIsomorphic("egg", "add"));      // true
        System.out.println("foo, bar: " + isIsomorphic("foo", "bar"));      // false
        System.out.println("paper, title: " + isIsomorphic("paper", "title")); // true
        System.out.println("badc, baba: " + isIsomorphic("badc", "baba")); // false (d -> b, but c also needs to map to b)
        System.out.println("ab, aa: " + isIsomorphic("ab", "aa")); //false
    }


    public static boolean isIsomorphic(String s, String t) {

        if(s.length()!=t.length()){
            return false;  
        }

        Map<Character, Character> mapST = new HashMap<>();
        Map<Character, Character> mapTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char cs = s.charAt(i);
            char ct = t.charAt(i);

            if (mapST.containsKey(cs)) {
                if (mapST.get(cs) != ct) 
                return false;
            } else {
                mapST.put(cs, ct);
            }
            
            if (mapTS.containsKey(ct)) {
                if (mapTS.get(ct) != cs) 
                return false;
            } else {
                mapTS.put(ct, cs);
            }
           
        }

         return true;
    }
    
}
