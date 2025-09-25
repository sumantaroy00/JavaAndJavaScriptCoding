package JavaCoding.DSA.MathAndGeometry;

public class palimDromeNumber {


    public static void main(String[] args) {

        int x = 121; // 123
        System.out.println(isPalindrome(x));
        
    }

    public static boolean isPalindrome(int x) {

        int num = x;
        int result = 0;
        while(num>0){
           int mod = num%10;
           result = result * 10 + mod;
           num=num/10;
        }

        if(result == x)
         return true;
         else
         return false;
        
    }
    
}
