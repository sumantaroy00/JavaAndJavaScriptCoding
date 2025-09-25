package JavaCoding.DSA.arrayAndHashing;

import java.util.Arrays;

public class Largestnumberwhenconcatenated {

        public static void main(String[] args) {
        

            int[] nums = {3, 30, 34, 5, 9};
            System.out.println(largestNumber(nums));  // Output: "9534330"
        }

        public static String largestNumber(int [] nums){

            // Convert int[] to String[]

            String [] strNums = new String[nums.length];
            for(int i =0 ;i<nums.length;i++){

                strNums[i] = String.valueOf(nums[i]);
            }


            Arrays.sort(strNums,(a,b)-> (b+a).compareTo(a+b));

            
        // Edge-case: if the highest string is "0", all must be zeros
           if (strNums[0].equals("0")) {
            return "0";
           }

            StringBuilder sb = new StringBuilder();
            for (String s : strNums) {
               sb.append(s);
             }

             return sb.toString();

        }


    
}
    

