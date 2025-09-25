package JavaCoding.String.PrefixSuffixProblem;
 
import java.util.*;

public class longestCommonPrefix {

    public static void main(String[] args) {

        String [] str = {"cluster" , "clue","clutch","club","clumsy"};

        Arrays.sort(str);
        StringBuffer sb = new StringBuffer();

        char[] first = str[0].toCharArray();
        char[] last =  str[str.length-1].toCharArray();


        for(int i=0 ; i<first.length;i++){

            if(first[i]!=last[i]){
            break;}

            sb.append(first[i]);

        }

       System.out.println(sb.toString());
    }

    
    
}
