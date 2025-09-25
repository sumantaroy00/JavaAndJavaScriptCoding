package JavaCoding.Array.ArrayLatest.MissingElementAndRanges;

import java.util.*;

public class findAllMissingNumber {

    public static void main(String[] args) {
        int [] arr = {4,3,2,8,2,3};

        List<Integer>  missingNumber = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for(int i : arr){
           set.add(i);

        }

        int max = Arrays.stream(arr).max().getAsInt();

        for(int i =1;i<=max;i++){
            if(!set.contains(i))
            missingNumber.add(i);
        }


        System.out.println(missingNumber);
    }
    
}
