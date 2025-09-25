package JavaCoding.String.StringManupulation;

public class stringAcronym {

    public static void main(String[] args) {
        
        System.out.println(toAcronym("As Soon As Possible"));      // Output: ASAP
        System.out.println(toAcronym("random access memory"));     // Output: RAM
        System.out.println(toAcronym("central processing unit"));  // Output: CPU
    }




    public static String toAcronym(String str){

        if (str == null || str.isEmpty()) 
        return "";

        String[] words = str.trim().split("\\s+");  // split by whitespace
        StringBuilder acronym = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                acronym.append(Character.toUpperCase(word.charAt(0)));
            }
        }

        return acronym.toString();


    }
    
}
