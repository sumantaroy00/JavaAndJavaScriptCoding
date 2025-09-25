package JavaCoding.Array.ArrayLatest.MissingElementAndRanges;

public class RemoveDuplicatesfromSorted {

/*→ Asked in: Amazon, Google, Microsoft, Meta, Apple
→ Topic: Two Pointer / In-place Array Modification
→ Difficulty: Easy


Problem Statement:
Given a sorted array nums, remove the duplicates in-place such that each element appears only once and return the new length.

Do not allocate extra space — modify input array in-place with O(1) extra memory.

Optimal Approach: Two Pointer (Slow & Fast Pointer)
Time: O(n)
Space: O(1)

*/

    public static void main(String []args){

        int num[] = {1, 1, 2, 3, 4};
        int len = num.length,i=0;// pointer for the position of unique elements

        for(int j=1;j<len;j++){
             
            if(num[j]!=num[i]){  
                i++;          
                num[i] = num[j];
            }
        }

                for(int k=0;k<=i;k++){
                    System.out.print(num[k] + " ");
                }


    }
    
}
