package JavaCoding.String.SortingProblem;

import java.util.Arrays;
import java.util.Comparator;

public class stringWordSortingBylength {

  public static String sort(String input){

    String [] words = input.split(" ");

    //object.equals(str1,str2) str.compareTo(str) -- all these compare strings

        
    // Sort the words by their length using a lambda function in Arrays.sort()
   // Arrays.sort(words, (word1, word2) -> word2.length() - word1.length());

    Arrays.sort(words, Comparator.comparingInt(String::length));


    return String.join(" ", words);

  }

    public static void main(String[] args){

        String input = "This is Sumanta who is a good coder";
        String ouput = sort(input);
        System.out.println(ouput);

    }
    
}
