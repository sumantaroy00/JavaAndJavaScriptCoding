package JavaCoding.String.SortingProblem;

import java.util.*;

public class SortVowelsinString {

    public static void main(String[] args) {
        
     String str =  "lEetcOde" ; // ouput - lEOtcede

       Set<Character> vowelsSet = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));

       List<Character> vowels = new ArrayList<>();

        // Collect vowels
        for (char c : str.toCharArray()) {
            if (vowelsSet.contains(c)) {
                vowels.add(c);
            }
        }

        Collections.sort(vowels);
        System.out.println(vowels);

        // Replace vowels in original string
        StringBuilder result = new StringBuilder();
        int vowelIndex = 0;

        for (char c : str.toCharArray()) {
            if (vowelsSet.contains(c)) {
                result.append(vowels.get(vowelIndex++));
            } else {
                result.append(c);
            }
        }

        System.out.println(result.toString());

    }
    
}
