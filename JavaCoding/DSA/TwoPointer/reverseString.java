package JavaCoding.DSA.TwoPointer;
import java.util.*;
public class reverseString {

    public static void main(String[] args) {

        char [] s = {'h','e','o','l','l','0'};
            int left = 0;
        int right = s.length-1;

        while(left<right){

            char temp = s[right];
            s[right]= s[left];
            s[left] = temp;

            left++;
            right--;
        }

        System.out.println(Arrays.toString(s));
        
    }
    
}
