package JavaCoding.Array.ArrayLatest.ArrayRotation;

import java.util.Arrays;

public class rotateArrayRight {

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7};
        int k =4;
        int len=arr.length-1;
        k=k%len;

       arr = reverse(arr,0,len);
       arr = reverse(arr,0,k-1);
       arr = reverse(arr,k,len);

System.out.println(Arrays.toString(arr));
        
    }
    public static int[] reverse(int [] arr1 , int start,int end){
      
        while(start<end){

           int temp  = arr1[start];
           arr1[start]=arr1[end];
           arr1[end]=temp;
           start++;
           end--;
            

    }
    return arr1;
   }
}
