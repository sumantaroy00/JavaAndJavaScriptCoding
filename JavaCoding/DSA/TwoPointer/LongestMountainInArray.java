package JavaCoding.DSA.TwoPointer;

public class LongestMountainInArray {

    public static void main(String[] args) {
        System.out.println(longestMountain(new int[]{2, 1, 1, 5, 6, 2, 3, 1}));
    }

    public static int longestMountain(int[] arr) {

        int n = arr.length-1;
        int maxLen = 0;
        int i = 1;

        while (i < n) {
            // Check if current index is a peak
            if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
                int left = i - 1;
                int right = i + 1;

                // Expand left while strictly increasing
                while (left > 0 && arr[left - 1] < arr[left]) {
                    left--;
                }

                // Expand right while strictly decreasing
                while (right < n && arr[right] > arr[right + 1]) {
                    right++;
                }

                // Calculate mountain length
                int mountainLen = right - left + 1;

                // Update max length
                maxLen = Math.max(maxLen, mountainLen);

                // Skip to end of this mountain
                i = right;
            } else {
                i++; // Move to next element
            }
        }

        return maxLen;
    
    }
}
