package JavaCoding.Array.ArrayLatest.mostAsked;
import java.util.*;
public class movingZerotoStart {
/*  
 // Fill non-zero elements from the end
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                result[index--] = arr[i];
            }
    }*/
    public static void main(String[] args) {
         int [] arr = {1,0,2,0,3,0,4,5};
          int count = 0,j=0;
         List<Integer> temp = new ArrayList<>();

         for(int i =0 ;i<arr.length;i++){

            if(arr[i]!=0){
                temp.add(arr[i]);
            }
         }

         
        for(int i=0;i<arr.length;i++){
             
            if(arr[i]==0){
                arr[count++]=arr[i];
                            }
        }
          
        
        while(count<arr.length){
            arr[count++]=temp.get(j++);
        }
        
        System.out.println(Arrays.toString(arr)); 
        }

         
}