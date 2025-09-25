package JavaCoding.Array.ArrayLatest.TwoSum;

import java.util.HashMap;

public class TwoSumProblem {

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
        System.out.println("[" + nums[result[0]] + ", " + nums[result[1]] + "]");

    }
        
        public static int[] twoSum(int[] nums, int target) {
            HashMap<Integer, Integer> numMap = new HashMap<>(); // Store {num: index}
            
            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i]; // Find the number needed to reach target
                
                if (numMap.containsKey(complement)) { // Check if it exists in the HashMap
                   // return new int[]{numMap.get(complement), i};
                    return new int []{numMap.get(complement),i};
                }
                
                numMap.put(nums[i], i); // Store the current number and its index
            }
            
            return new int[0]; // Return empty array if no solution found
        }
    
        
}
    

