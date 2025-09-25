package JavaCoding.String.AnagramPalimdromeRotationProblem;

public class StringRotationCheck {

    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "cdeab";     


   if (s1.length() != s2.length() || s1.isEmpty()) {

      System.out.println("S2 is not rotation of S1");
   }
   String concatenated = s1 + s1;
   if(concatenated.contains(s2)){
        
    System.out.println("S2 is rotation of S1");
   }

   else{
    System.out.println("S2 is not rotation of S1");
   }
}
    
}
