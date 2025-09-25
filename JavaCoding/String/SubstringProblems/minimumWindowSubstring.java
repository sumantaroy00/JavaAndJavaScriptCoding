package JavaCoding.String.SubstringProblems;
import java.util.HashMap;

public class minimumWindowSubstring {

    public static void main(String[] args) {

        String s1 = "ADOBECODEBANC";
        String s2 = "ABC";

        System.out.println("Minimum Window Substring: " + minWindow(s1, s2));
        
        
    }
    public static String minWindow(String s , String t){

        if (s.length() < t.length()) return "";

        HashMap<Character, Integer> tMap = new HashMap<>();
        for (char ch : t.toCharArray()) {
            tMap.put(ch, tMap.getOrDefault(ch, 0) + 1);
        }
         
        int left = 0, right = 0, minStart = 0, minLen = Integer.MAX_VALUE;
        int required = tMap.size(), formed = 0;
        HashMap<Character, Integer> windowMap = new HashMap<>();


        while (right < s.length()) {
            char ch = s.charAt(right);
            windowMap.put(ch, windowMap.getOrDefault(ch, 0) + 1);

            if (tMap.containsKey(ch) && windowMap.get(ch).intValue() == tMap.get(ch).intValue()) {
                formed++;
            }

            while (formed == required) { // Try to shrink window
                
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    minStart = left;
                }

                char leftChar = s.charAt(left);
                windowMap.put(leftChar, windowMap.get(leftChar) - 1);

                if (tMap.containsKey(leftChar) && windowMap.get(leftChar) < tMap.get(leftChar)) {
                    formed--;
                }
                left++;
            }
            right++;

    }
    return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
}
    
    
}
