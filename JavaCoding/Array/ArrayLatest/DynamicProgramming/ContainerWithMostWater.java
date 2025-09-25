package JavaCoding.Array.ArrayLatest.DynamicProgramming;


/*Container With Most Water — Most Asked Interview Problem
→ Asked in: Amazon, Google, Microsoft, Meta, Flipkart, etc.
→ Topic: Two Pointer + Array
→ Difficulty: Medium

Given n non-negative integers where each represents a point at coordinate (i, a[i]).
Find two lines such that together with the x-axis, they form a container that holds the most water.

 */

public class ContainerWithMostWater {

    public static void main(String[] args) {

       int [] height = {1,8,6,2,5,4,8,3,7};
       int len = height.length;

       int left = 0 , right=len-1;
       int maxArea = 0;

       while(left<right){
          int width = right-left;
       
          int area = Math.min(height[left],height[right])*width;
          maxArea = Math.max(area,maxArea);


        if (height[left] < height[right])
           left++;
        else
           right--;


       }

        System.out.println(maxArea);
    }


 
    
}
