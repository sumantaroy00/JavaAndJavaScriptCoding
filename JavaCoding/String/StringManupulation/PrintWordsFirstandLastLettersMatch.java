package JavaCoding.String.StringManupulation;

public class PrintWordsFirstandLastLettersMatch {

    public static void main(String[] args) {



        String [] str = {"Match" , "Madam" , "Radar"};
        StringBuilder result = new StringBuilder();

        for(String word : str){

            String lowerCaseWord = word.toLowerCase();

            int i=0;
            int j= word.length()-1;
              
            char first = lowerCaseWord.charAt(i);
            char last = lowerCaseWord.charAt(j);

            if(first==last){
                result.append(word).append(" ");

            }


        }

        System.out.println(result.toString());
        
    }
    
}
