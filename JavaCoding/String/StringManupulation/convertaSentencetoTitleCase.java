package JavaCoding.String.StringManupulation;

public class convertaSentencetoTitleCase {
    

    public static void main(String[] args) {

        String str = "hello world i am SuManta";
        StringBuilder titleCaseSentence = new StringBuilder();
        String[] words = str.split(" ");
        
        for (String word : words) {
            if (!word.isEmpty()) {

            String capitalizedWord =word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
            titleCaseSentence.append(capitalizedWord).append(" ");
                        
        
        }
                                
    }            
       System.out.println(titleCaseSentence.toString().trim());

        
    }
}
