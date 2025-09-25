package JavaCoding.String.SortingProblem;

public class  longestWordInASentence {

    public static void main(String[] args) {

        String str ="The quick brown fox hdsajdjsadjs";
        int len=0,max=0;
        String maxword="";

        String[] words =str.split(" ");

        for(String word : words){

          len = word.length();
          if(len>max){     
            max=len;
            maxword =word;
          }

        }

        System.out.println(maxword);
        
    }
    
}
