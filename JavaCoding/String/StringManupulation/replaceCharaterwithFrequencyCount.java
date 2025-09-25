package JavaCoding.String.StringManupulation;

import java.util.HashMap;

public class replaceCharaterwithFrequencyCount {

    public static void main(String[] args) {
        String str = "Automation";
        String str1=str.toLowerCase();

        HashMap<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        // Count the frequency of each character
        for (char ch : str1.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Build the transformed string
        for (char ch : str1.toCharArray()) {
            if (map.get(ch) > 1) {
                sb.append(map.get(ch));  // Replace repeated characters with frequency
            } else {
                sb.append(ch);  // Keep non-repeating characters unchanged
            }
        }

        System.out.println( sb.toString());
        
    }
    
}
