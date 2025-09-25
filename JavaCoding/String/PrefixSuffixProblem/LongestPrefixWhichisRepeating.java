package JavaCoding.String.PrefixSuffixProblem;

public class LongestPrefixWhichisRepeating {

    public static void main(String[] args) {
        
        String str = "ababcab";
        int len = str.length();

       for(int i = len-1 ;i>0;i--){
        String prefix = str.substring(0, i);

        // Check if the prefix occurs again in the string (excluding the first position)

           if(str.indexOf(prefix,1) != -1){

             System.out.println(prefix);
             System.out.println(str.indexOf(prefix,1));
             break;
           }

       }

       



    }
    
}
