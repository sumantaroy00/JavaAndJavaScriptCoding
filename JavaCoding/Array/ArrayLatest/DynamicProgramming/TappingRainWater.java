package JavaCoding.Array.ArrayLatest.DynamicProgramming;

public class TappingRainWater {


    /*🧠 Problem Statement
      Given an array height[] representing the elevation map where the width of each bar is 1, compute how much water it is able to trap after raining. 
      
      Two pointer approach
      */

      public static void main(String[] args) {
        int[] elevation = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("Trapped Water: " + trap(elevation));  // Output: 6
    }


    public  static int trap(int [] height){

        int right = height.length-1;
        int left = 0;
        int maxLeft =0 , maxRight=0;
        int totalWater= 0;

        while(left<right){

            maxLeft = Math.max(maxLeft,height[left]); //0 ,1,1
            maxRight = Math.max(maxRight,height[right]);//1,2,2

                if(maxLeft<maxRight){//0<1              
                  totalWater +=  maxLeft - height[left];//0,0,0
                  left++;//1,2,3


                }
                else {
                    totalWater +=  maxRight - height[right];
                    right--;

                }

        }


        return totalWater;

    }
}
