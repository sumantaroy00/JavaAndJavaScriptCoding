package JavaCoding.String.Regex;
import java.util.*;
import java.util.regex.*;

public class validateEmail {

    public static void main(String[] args) {
        
   

    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();

    Pattern p = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",Pattern.CASE_INSENSITIVE);
    Matcher m = p.matcher(input);
    System.out.println(input + " email is " + (m.matches() ? "valid" : "invalid"));

    sc.close();
    
 }

}
