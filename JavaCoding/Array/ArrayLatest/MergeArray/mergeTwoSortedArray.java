package JavaCoding.Array.ArrayLatest.MergeArray;

import java.util.Arrays;

public class mergeTwoSortedArray {

    public static void main(String[] args) {
        

        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8, 10};

        int len1 = arr1.length;
        int len2 = arr2.length;

        int [] result = new int[len1+len2];

        int i =0 , j=0 , k=0;

        while(i<len1 && j<len2){

            if(arr1[i]<=arr2[j]){
                result[k++]=arr1[i++];
            }
            else{
                result[k++]=arr2[j++];
            }

        }

        while(i<len1) result[k++]=arr1[i++];
       
        while(j<len2) result[k++]=arr2[j++];
        


        System.out.println(Arrays.toString(result));
    }
    
}
