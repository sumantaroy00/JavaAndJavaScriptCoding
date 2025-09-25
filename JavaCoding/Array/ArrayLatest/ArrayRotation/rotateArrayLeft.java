package JavaCoding.Array.ArrayLatest.ArrayRotation;

import java.util.Arrays;

public class rotateArrayLeft {

    public static void main(String[] args) {
        

        int [] arr = {1,2,3,4,5,6,7};
        int k =4;
        int len=arr.length-1;
        k=k%len;

         reverse(arr,0,k-1);
         reverse(arr,k,len);
         reverse(arr,0,len);

           System.out.println(Arrays.toString(arr));
        
    }
    public static void reverse(int [] arr , int start,int end){
      
        while(start<end){

           int temp  = arr[start];
           arr[start]=arr[end];
           arr[end]=temp;
           start++;
           end--;      

    }

   }
    
}
