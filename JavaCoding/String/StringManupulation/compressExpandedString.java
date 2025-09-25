package JavaCoding.String.StringManupulation;

public class compressExpandedString {

    public static void main(String[] args) {
        String str = "ccccaacddbbaac";


        int count =1;
        if (str == null || str.length() == 0) {
            System.out.println("");
            return;
        }
    
        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                sb.append(str.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        
        // Append last group
        sb.append(str.charAt(str.length() - 1)).append(count);
        

        System.out.println(sb.toString());
    }
    
}
