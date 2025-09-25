package JavaCoding.DSA.arrayAndHashing;

import java.util.Arrays;

public class SumofAbsoluteDifferences {

    public static void main(String[] args) {
        int [] nums = {2,3,5};
         int n = nums.length;

        int[] result = new int[n];
    
    for (int i = 0; i < n; i++) {
        int sum = 0;
        for (int j = 0; j < n; j++) {
            sum += Math.abs(nums[i] - nums[j]);
        }
        result[i] = sum;
    }
    

        System.out.println(Arrays.toString(result));

    }


    
}
