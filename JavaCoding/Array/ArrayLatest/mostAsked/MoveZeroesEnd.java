package JavaCoding.Array.ArrayLatest.mostAsked;

import java.util.Arrays;

public class MoveZeroesEnd {

    public static void main(String[] args) {
        int arr [] ={0, 1, 0, 3, 12};

        int count = 0;
        int len = arr.length;
  
        for(int i =0;i<len;i++){
            
            if(arr[i]!=0){
                arr[count++]=arr[i];

            }
        }

        while(count<len){
            arr[count++]=0;
        }

        System.out.println(Arrays.toString(arr));
    }


    
}
