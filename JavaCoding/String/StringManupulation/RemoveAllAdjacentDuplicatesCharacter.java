package JavaCoding.String.StringManupulation;

public class RemoveAllAdjacentDuplicatesCharacter {

    public static void main(String[] args) {
        String s = "abbaca";

        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            int size = sb.length();
            if(size > 0 && sb.charAt(size - 1) == ch){
                sb.deleteCharAt(size - 1);
            }
            else {
                sb.append(ch);
            }
          
        }

        System.out.println(sb.toString());
    }
    
}
