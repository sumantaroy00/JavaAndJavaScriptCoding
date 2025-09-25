package JavaCoding.String.StringManupulation;

public class stringswap {

public static void main(String[] args) {


    String a = "Sumanta";
    String b = "Roy";

    a = a +b ;

    b = a.substring(0,a.length()-b.length());
    System.out.println(b);
    a = a.substring(b.length());
    System.out.println(a);

    
   }
    
}
