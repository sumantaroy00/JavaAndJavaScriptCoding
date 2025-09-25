package JavaCoding.Array.ArrayLatest.ThreeSum;
import java.util.*;

/**
 * Three Sum Problem
 * 
 * Problem Statement:
 * Given an array of integers nums, find all unique triplets in the array 
 * that sum up to 0. The solution set must not contain duplicate triplets.
 * 
 * Example:
 * Input: nums = [-1, 0, 1, 2, -1, -4]
 * Output: [[-1, -1, 2], [-1, 0, 1]]
 * Explanation: 
 * - The triplets that sum to 0 are: [-1, -1, 2] and [-1, 0, 1]
 * - Note that the order of the output and the order of the triplets does not matter
 * 
 * Time Complexity: O(n²)
 * Space Complexity: O(1) - not counting the space required for output
 */
public class ThreeSum {
    
    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        
        // If array is null or has less than 3 elements, return empty result
        if (nums == null || nums.length < 3) {
            return new ArrayList<>(result);
        }
        
        // Sort the array first (this helps in skipping duplicates)
        Arrays.sort(nums);
        
        // Fix the first element and use two pointers for the remaining two elements
        for (int i = 0; i < nums.length - 2; i++) {
           
            // Use two pointers technique
            int left = i + 1;
            int right = nums.length - 1;
            
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                
                if (sum == 0) {
                    // Found a triplet
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                 
                    }       
        
                else if (sum < 0) {
                    // Sum is too small, increment left pointer
                    left++;
                } else {
                    // Sum is too large, decrement right pointer
                    right--;
                }
            }
        }
        
        return new ArrayList<>(result);
    }
    
    // Test cases
    public static void main(String[] args) {
        // Test case 1
        int[] nums1 = {-1, 0, 1, 2, -1, -4};
        System.out.println("Test Case 1:");
        System.out.println("Input: " + Arrays.toString(nums1));
        System.out.println("Output: " + threeSum(nums1));
        
        // Test case 2
        int[] nums2 = {0, 0, 0, 0};
        System.out.println("\nTest Case 2:");
        System.out.println("Input: " + Arrays.toString(nums2));
        System.out.println("Output: " + threeSum(nums2));
        
        // Test case 3
        int[] nums3 = {-2, 0, 1, 1, 2};
        System.out.println("\nTest Case 3:");
        System.out.println("Input: " + Arrays.toString(nums3));
        System.out.println("Output: " + threeSum(nums3));
    }
} 