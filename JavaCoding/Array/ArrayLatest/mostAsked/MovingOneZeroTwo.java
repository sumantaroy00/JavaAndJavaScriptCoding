package JavaCoding.Array.ArrayLatest.mostAsked;

import java.util.Arrays;

public class MovingOneZeroTwo {

    public static void main(String[] args) {

        int [] arr = {1,0,2,2,0,1,0,2,1,0,1};


        int left =0, right = arr.length-1,temp=0,mid=0;
    
        while(mid<=right){

            if(arr[mid]==0)
            {
                temp = arr[mid];
                arr[mid]=arr[left];
                arr[left]=temp;
                mid++;
                left++;

            }
                      
           else if(arr[mid]==1){
                 mid++;
           }

           else {             
                temp = arr[mid];
                arr[mid]=arr[right];
                arr[right]=temp;
                right--;
           }
        
        
    }

      System.out.println(Arrays.toString(arr));
        
    /*  int [] arr = {2,1,0,0,1,2,1};
         int zero =0 , one =0,two=0,index=0;
         
         for(int num : arr){
             
             if(num ==0 )zero++;
             if(num==1)one++;
             if(num==2)two++;
         }
         while(zero-->0)arr[index++] = 0;
         while(one-->0)arr[index++] = 1;
         while(two-->0)arr[index++] = 2; */
    
   }
}