package JavaCoding.String.StringManupulation;

public class ownATOI {

    public static void main(String[] args) {
    

        System.out.println(myAtoi("42"));               // 42
        System.out.println(myAtoi("   -42"));           // -42
        System.out.println(myAtoi("4193 with words"));  // 4193
        System.out.println(myAtoi("words and 987"));    // 0
        System.out.println(myAtoi("-91283472332")); 
    }

    public static int myAtoi(String s){

        if (s == null || s.isEmpty()) 
        return 0;
       

        int i = 0, sign = 1, total = 0;
        int n = s.length();



        // 1. Remove leading whitespaces
        while (i < n && s.charAt(i) == ' ') i++;

         // 2. Handle optional sign
          if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }



        // 3. Convert digits to integer
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            // 4. Handle overflow
            if (total > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            total = total * 10 + digit;
            i++;
        }

        return total * sign;
    }
    
}
