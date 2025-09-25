package JavaCoding.String.SortingProblem;

import java.util.Arrays;
import java.util.Comparator;

public class SortStringsNumericSuffix {

    public static void main(String[] args) {

    
        String[] arr = {"img12", "img10", "img2", "img1"};

        Arrays.sort(arr, Comparator.comparingInt(SortStringsNumericSuffix::extractNumericSuffix));

        System.out.println(Arrays.toString(arr));  // Output: [img1, img2, img10, img12]
    }

    // Extract numeric suffix from end of string without regex
    private static int extractNumericSuffix(String s) {
        int i = s.length() - 1;
        // Move backward to find where digits start
        while (i >= 0 && Character.isDigit(s.charAt(i))) {
            i--;
        }
        // Substring from first digit to end
        String numPart = s.substring(i + 1);
        return numPart.isEmpty() ? Integer.MAX_VALUE : Integer.parseInt(numPart);
    }

    
}
