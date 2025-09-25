package JavaCoding.String.StringManupulation;

public class reverseString2 {

    /*541. Reverse String II

Given a string s and an integer k, reverse the first k 
characters for every 2k characters counting from the start of the string.
If there are fewer than k characters left, reverse all of them. 
If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and leave the other as original.


Example 1:

Input: s = "abcdefg", k = 2
Output: "bacdfeg" */

    public static void main(String[] args) {
      String s = "abcdefg"; int k =2;
        
     char [] ch = s.toCharArray();

     for(int i=0;i<ch.length;i = i+2*k){
         
         int left = i ;
         int right = Math.min(i+k-1,ch.length-1);

         while(left<right){


            char temp = ch[right];
            ch[right]=ch[left];
            ch[left]=temp;

               left++;
               right--;


         }



     }
        System.out.println(new String(ch));
        
    }
    
}
