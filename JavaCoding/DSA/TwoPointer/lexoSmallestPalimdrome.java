package JavaCoding.DSA.TwoPointer;

import java.util.Arrays;

public class lexoSmallestPalimdrome {

    public static void main(String[] args) {
        
       String s = "egcfe";
         char[] ch = s.toCharArray();
        int left = 0;
        int right = ch.length - 1;

        while (left < right) {
            if (ch[left] != ch[right]) {
                // Replace the larger character with the smaller one
                if (ch[left] < ch[right]) {
                    ch[right] = ch[left];
                } else {
                    ch[left] = ch[right];
                }
            }
            left++;
            right--;
        }

       System.out.println(Arrays.toString(ch));
    }
    
}
