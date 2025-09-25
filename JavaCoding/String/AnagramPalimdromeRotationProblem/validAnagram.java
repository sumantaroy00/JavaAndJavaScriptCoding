package JavaCoding.String.AnagramPalimdromeRotationProblem;

import java.util.Arrays;

public class validAnagram {

    public static void main(String[] args) {
        
 
       String str = "sumanta roY";
       String str1 = "mantasu Yob";


       if(str.length()!=str1.length()){
        System.out.println("Strings are not Anagram");
        System.exit(0); 
       }
       
       char [] a = str.toCharArray();
       char [] b = str1.toCharArray();
       Arrays.sort(a);
       Arrays.sort(b);

       for (int i = 0; i < a.length; i++){
            if (a[i] != b[i])    {     
            System.out.println("Strings are not Anagram");
            System.exit(0); }

       }
       
       System.out.println("Strings are  Anagram");
       
    


    }
    
}



/* 
s = s.toLowerCase();
t = t.toLowerCase();
int[] count = new int[26];
    for (int i = 0; i < s.length(); i++) {
        count[s.charAt(i) - 'a']++;
        count[t.charAt(i) - 'a']--;
    }

    for (int c : count) {
        if (c != 0) return false;
    }
    return true; */