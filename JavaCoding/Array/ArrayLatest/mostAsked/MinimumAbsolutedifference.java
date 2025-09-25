package JavaCoding.Array.ArrayLatest.mostAsked;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsolutedifference {

    public static void main(String[] args) {

        int [] arr ={4,1,2,3};

        int len = arr.length-1;
        int min = Integer.MAX_VALUE;
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);

        for(int i = 0;i<len;i++){

            int diff = arr[i+1]-arr[i];
            min = Math.min(diff,min);

        }

        for(int i = 0;i<len;i++){

            int diff = arr[i+1]-arr[i];
            if(min==diff)
             res.add(Arrays.asList(arr[i],arr[i+1]));

        }

       

        System.out.println(res);
        
    }


    
}


 /*
        // Single pass: track min and collect pairs
        
        for (int i = 0; i < arr.length - 1; i++) {
            int diff = arr[i + 1] - arr[i];

            if (diff < min) {
                min = diff;
                list.clear(); // New smaller min — reset the list
                list.add(Arrays.asList(arr[i], arr[i + 1]));
            } else if (diff == min) {
                list.add(Arrays.asList(arr[i], arr[i + 1]));
            }
        }
       */