package JavaCoding.String.StringManupulation;

public class StringManupluationUpperCaseFirstChar {

    public static void main(String[] args) {

        String str = "this is sumanta";

        String [] words = str.split(" ");
    
        StringBuilder sb = new StringBuilder();
    
       for(String word : words){


        String newWORD = word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase() ;

        sb.append(newWORD).append(" ");
        
    }

    System.out.println(sb.toString());

   }

    
}
