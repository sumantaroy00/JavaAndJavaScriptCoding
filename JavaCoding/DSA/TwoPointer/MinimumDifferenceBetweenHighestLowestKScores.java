package JavaCoding.DSA.TwoPointer;

import java.util.Arrays;

public class MinimumDifferenceBetweenHighestLowestKScores {

    public static void main(String[] args) {

       int []  nums = {9,4,1,7};
       int k =2;
          if (k == 1) 

    Arrays.sort(nums); // O(n log n)
    int minDiff = Integer.MAX_VALUE;

    for (int i = 0; i <= nums.length - k; i++) {
        int diff = nums[i + k - 1] - nums[i];  // Max - Min in current window
        minDiff = Math.min(minDiff, diff);
    }


        
    }
    
}
