package JavaCoding.NumberReverseProblem;

import java.util.Scanner;

public class reverseIntegerWithoutFirstAndLast {

    public static void main(String[] args) {
/*
        Scanner sc = new Scanner(System.in);
 
        int i = Integer.parseInt(sc.nextLine());
        System.out.println("Entered number is "  +  i );

        int num = i;
        int result=0 ;
        while(num>0)
         {
            result = result *10 + num%10;
            num = num/10;

         }    

      System.out.println("Reverse number is " + result);
*/
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      int num = Integer.parseInt(str);
      int temp = num;
      int digitCount=0;

      while (temp > 0) {
        temp /= 10;
        digitCount++;
     }

  
      int divisor = (int)Math.pow(10, digitCount-1);
      int firstDigit = num / divisor;
      int lastDigit = num % 10;

      
      int middlePart = (num % divisor) / 10;
      

      int result = 0;
      while (middlePart > 0) {
        result = result * 10 + middlePart%10;
        middlePart = middlePart/10;
     }

     int  finalResult = firstDigit * divisor + (result * 10) + lastDigit;

     System.out.println(finalResult);
    }
    
}
