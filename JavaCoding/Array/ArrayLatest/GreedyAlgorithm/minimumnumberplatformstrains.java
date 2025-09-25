 package JavaCoding.Array.ArrayLatest.GreedyAlgorithm;
 import java.util.*;
 
 public class minimumnumberplatformstrains{

    /*Given two arrays, arr[] and dep[], that represent the arrival and departure times of trains respectively, the task is to find the minimum number of platforms required so that no train waits.

Examples: 

Input: arr[] = [900, 940, 950, 1100, 1500, 1800], dep[] = [910, 1200, 1120, 1130, 1900, 2000]
Output: 3 
Explanation: There are three trains during the time 9:40 to 12:00. So we need a minimum of 3 platforms.


Input: arr[] = [1,  5], dep[] = [3, 7] 
Output: 1 
Explanation:  All train times are mutually exclusive. So we need only one platform */

        public static void main(String[] args) {

                int[] arr = {900, 940, 950, 1100, 1500, 1800};//900 940,950,1100,1500,1800
                int[] dep = {910, 1200, 1120, 1130, 1900, 2000};//910,1120,1130,1200,1900,2000
                System.out.println(minPlatforms(arr, dep));
    
            
        }

       public static int minPlatforms(int[] arrivals, int[] departures) {
         int len = arrivals.length;
 
         Arrays.sort(arrivals);
         Arrays.sort(departures);
 
         int platformsNeeded = 0;
         int maxPlatforms = 0;
 
         int i = 0; // pointer for arrival
         int j = 0; // pointer for departure
 
         while (i < len && j < len) {
             // If train arrives before previous one departs -> need extra platform
             
             if (arrivals[i] <= departures[j]) {
                 platformsNeeded++;
                 maxPlatforms = Math.max(maxPlatforms, platformsNeeded);
                 i++;
             } else {
                 // Train departed, one platform freed
                 platformsNeeded--;
                 j++;
             }
         }
 
         return maxPlatforms;
     }

 }