package JavaCoding.DSA.TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class countPairsWhoseSumisLessThanTarget {

    public static void main(String[] args) {
        
        int target = 2;
         
        List<Integer> nums =  new ArrayList<>(Arrays.asList(-1,1,2,3,1));
        Collections.sort(nums); //
        int count = 0;
        int left = 0;
        int right = nums.size()-1;
        int sum = 0;

        while(left<right) {          
        sum = nums.get(left) + nums.get(right);

            if(sum<target){
                count = count + right - left;
                left++;
            }
            else{
               right--;
            }
           
        }

        System.out.println(count);
    }
    
}
