package JavaCoding.String.StringManupulation;

public class ReverseStringWordbyWord {

    public static void main(String[] args) {
        String str = "hello world ";

        String [] words = str.split("\\s+");
        StringBuilder sb = new StringBuilder();

        for(int i=words.length-1;i>=0;i--){
            sb.append(words[i]).append(" ");
            
        }

        System.out.println(sb.toString().trim());

    }
    
}
