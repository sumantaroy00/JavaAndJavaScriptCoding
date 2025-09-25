package JavaCoding.DSA.arrayAndHashing;

public class scoreOfAString {

    public static void main(String[] args) {
        

        System.out.println(scoreOfString("hello"));  // Output: 13
        System.out.println(scoreOfString("zaz"));    // Output: 50
    }
    

    public static int scoreOfString(String s){

         int output = 0;
        for(int i = 1 ; i<s.length();i++){

         output = output + Math.abs(s.charAt(i) - s.charAt(i-1) );

        }

        return output;
    }
    
}
