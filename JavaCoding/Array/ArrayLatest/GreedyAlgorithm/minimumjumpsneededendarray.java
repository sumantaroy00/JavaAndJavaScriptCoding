package JavaCoding.Array.ArrayLatest.GreedyAlgorithm;

public class minimumjumpsneededendarray {

    /*
     * 
     Problem Statement:
Given an array where each element represents the maximum 
number of steps that can be taken forward from that index, 
find the minimum number of jumps needed to reach the last index. 
If it's not possible to reach the end, return -1.
     */

    public static void main(String[] args) {
        

        int[] arr = {2, 3, 1, 1, 4};
        System.out.println("Minimum jumps needed: " + minJumps(arr));
    }
    
    public static boolean minJumps(int [] nums){


        //This is the first variation which tell can we reach the final position and returns a boolean

        
          int finalPosition = nums.length-1;
            for(int i = finalPosition-2;i>=0;i--){
                     if(i+nums[i]>=finalPosition)
                     finalPosition = i;
            }

       return finalPosition==0;
              
       
    }
}
