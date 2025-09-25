package JavaCoding.String.StringManupulation;

public class expandCompressedString {

    public static void main(String[] args) {
        
        String s = "a13b2c1";
        StringBuilder sb = new StringBuilder();

        int len = s.length();

        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);

            // First check boundary, then letter/digit check
            if (i + 1 < len && Character.isLetter(ch) && Character.isDigit(s.charAt(i + 1))) {
                int j = i + 1;
                StringBuilder countStr = new StringBuilder();

                // Collect multi-digit number
                while (j < len && Character.isDigit(s.charAt(j))) {
                    countStr.append(s.charAt(j));
                    j++;
                }

                int count = Integer.parseInt(countStr.toString());

                sb.append(String.valueOf(ch).repeat(count));

                // Skip the digits we already processed
                i = j - 1;
            }
        }

        System.out.println(sb.toString());
    }
    
}
