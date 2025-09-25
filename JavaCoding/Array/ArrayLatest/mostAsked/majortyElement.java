package JavaCoding.Array.ArrayLatest.mostAsked;

import java.util.HashMap;
import java.util.Map;

public class majortyElement {

    /*169. Majority Element

Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 */

    public static void main(String[] args) {
        
        int [] nums = {3,3,4};
        
        HashMap<Integer ,Integer> map = new HashMap<>();
        int finalkey=0;
        int max = 0;
        for(int num : nums){

            if(map.containsKey(num)){
            map.put(num,map.getOrDefault(num,0)+1);

            }

            else{
                map.put(num,1);
            }
        }

      for(Map.Entry<Integer, Integer> entry : map.entrySet()){
           int num = entry.getValue();
           int key = entry.getKey();
      
           if(num>max){
            max = num;
            finalkey = key;
           }
        }
   System.out.println(finalkey);
        
    }
    
}
