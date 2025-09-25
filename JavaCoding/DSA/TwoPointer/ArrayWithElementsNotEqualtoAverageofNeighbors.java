package JavaCoding.DSA.TwoPointer;

import java.util.*;

public class ArrayWithElementsNotEqualtoAverageofNeighbors {
/*You are given a 0-indexed array nums of distinct integers. 
You want to rearrange the elements in the array such that every
 element in the rearranged array is not equal to the average of its neighbors.
More formally, the rearranged array should have the 
property such that for every i in the range 1 <= i < nums.length - 1, (nums[i-1] + nums[i+1]) / 2 is not equal to nums[i]. */
   //Sort the array.
//Use two pointers (start and end) to alternate small and large numbers into a new array.

    public static int[] rearrangeArray(int[] nums) {
        Arrays.sort(nums); // Step 1: Sort the array
        int n = nums.length;
        int[] result = new int[n];

        int left = 0, right = n - 1;
        int index = 0;

        while (left <= right) {
            if (index % 2 == 0) {
                result[index++] = nums[left++];
            } else {
                result[index++] = nums[right--];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int[] result = rearrangeArray(nums);
        System.out.println(Arrays.toString(result)); // Example output: [1, 5, 2, 4, 3]
    }
}
