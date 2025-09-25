package JavaCoding.String.StringManupulation;

public class stripeWhiteSpaces {

    public static void main(String[] args) {
        
        String str = " Java  Developer ";
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (!Character.isWhitespace(c)) {
                sb.append(c);
            }
        }

        System.out.println(sb.toString());
    }
    
}


/*S

String input = "  Hello   World  ";
String output = input.replaceAll("\\s+", "");
System.out.println(output); 



*/