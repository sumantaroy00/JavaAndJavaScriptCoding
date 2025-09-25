package JavaCoding.Array.ArrayLatest.mostAsked;

public class KanadeAlgorithm {

    public static void main(String[] args) {

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum Subarray Sum: " + maxSubArray(nums)); // Output: 6
        

    }

    public static int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE; // Stores the maximum sum found
        int currentSum = 0; // Stores the sum of the current subarray

        for (int num : nums) {
            currentSum += num; // Add current element to current sum
            maxSum = Math.max(maxSum, currentSum); // Update maxSum if needed

            // If currentSum becomes negative, reset it to 0
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }

}
    

