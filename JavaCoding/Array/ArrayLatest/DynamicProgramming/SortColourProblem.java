package JavaCoding.Array.ArrayLatest.DynamicProgramming;

import java.util.Arrays;

public class SortColourProblem {

    /*The Sort Colors problem (also known as the Dutch National Flag problem) is a classic algorithmic problem that typically appears in coding interviews.

    Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

    We will use the integers 0, 1, and 2 to represent the colors:

    0 → red
    1 → white
    2 → blue

 */

    public static void main(String[] args) {

        int[] nums = {2, 0, 2, 1, 1, 0};

        int low = 0, mid =0, high = nums.length-1;

        while(mid<=high){

            if(nums[mid]==0){
                // Swap nums[low] and nums[mid]
                int temp = nums[low];
                nums[low]=nums[mid];
                nums[mid]= temp;
                low++;
                mid++;


            }
            else if(nums[mid]==1){
                mid++;

            }

            else{// nums[mid] == 2
               // Swap nums[mid] and nums[high]
                int temp = nums[mid];
                nums[mid]=nums[high];
                nums[high]= temp;
                high--;

            }


        }
        System.out.println(Arrays.toString(nums));
        
    }
    
}
