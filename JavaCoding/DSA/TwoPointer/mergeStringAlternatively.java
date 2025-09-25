package JavaCoding.DSA.TwoPointer;

public class mergeStringAlternatively {

    public static void main(String[] args) {
        
        String word1 = "abcd" ;
        String word2= "abc";

        int n = word1.length();
        int m = word2.length();

        StringBuilder sb = new StringBuilder();


        int i =0;
        int j=0;
       while(n>i && m>j){
             sb.append(word1.charAt(i++));
             sb.append(word2.charAt(j++));
             
       }

       while(n>i)  sb.append(word1.charAt(i++));
       while(m>j)  sb.append(word2.charAt(j++));

      System.out.println( sb.toString());


    }
    
}
