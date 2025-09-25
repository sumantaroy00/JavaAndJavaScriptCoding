package JavaCoding.Array.ArrayLatest.mostAsked;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/*
 ✅ Approach:
Add all elements to a HashSet for O(1) lookups.

Iterate through the array and only start counting from a number if it is the start of a sequence (i.e., num - 1 is not in the set).

For such numbers, keep checking the next consecutive numbers (num + 1, num + 2, ...) in the set.

Track the maximum length found.

💡 Time Complexity: O(n)
💡 Space Complexity: O(n)

 */

public class LongestConsecutiveSequence {

    public static void main(String[] args) 
    {

        int [] arr = {1,200,4,3,2,100,5,101,6,8};

            HashSet<Integer> set = new HashSet<>();
            
            List<Integer> result = new ArrayList<Integer>();
            
             for(int num : arr){
                set.add(num);
            }
       

            int maxlength = 0,currentNum =0;

            for(int num : arr){

                // this logic is for starting the sequence
                if(!set.contains(num-1)){
                    currentNum = num;  
                    List<Integer> seq = new ArrayList<Integer>();
                    seq.add(currentNum);

                
               // add all numbers in sequence
                    while(set.contains(currentNum+1)){
                        currentNum++;
                        seq.add(currentNum);

                    }
         
            
                    if (seq.size() > maxlength) {
                        maxlength = seq.size();
                        result = seq;
                        
                    }

               }
           }
           System.out.println(maxlength);
           System.out.println(result);
            
        
    }


   
    
}
