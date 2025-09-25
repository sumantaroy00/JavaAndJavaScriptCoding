package JavaCoding.DSA.TwoPointer;

import java.util.Arrays;

public class duplicateZerros {


    public static void main(String[] args) {

        int [] arr = {1,0,2,3,0,4,5,0};
         int possibleDups = 0;
        int length = arr.length - 1;

        // Count the number of zeros to be duplicated
        for (int i = 0; i <= length - possibleDups; i++) {
            if (arr[i] == 0) {
                // Edge case: zero at boundary
                if (i == length - possibleDups) {
                    arr[length] = 0; // last element
                    length -= 1;
                    break;
                }
                possibleDups++;
            }
        }

        // Start from the end and shift elements accordingly
        int last = length - possibleDups;

        for (int i = last; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + possibleDups] = 0;
                possibleDups--;
                arr[i + possibleDups] = 0;
            } else {
                arr[i + possibleDups] = arr[i];
            }
        }

        System.out.println(Arrays.toString(arr));

    }
    
}
