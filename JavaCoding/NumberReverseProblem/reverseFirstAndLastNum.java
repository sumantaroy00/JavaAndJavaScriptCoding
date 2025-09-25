package JavaCoding.NumberReverseProblem;

import java.util.Scanner;

public class reverseFirstAndLastNum {

    public static void main(String[] args) {
        
      Scanner sc = new Scanner(System.in);
      int num = Integer.parseInt(sc.next());
      System.out.println("Entered Number " + num);
      
      int count = 0;
      int temp = num;
      while(temp>0){
          
         temp = temp/10;
         count++;
      }

      int last = num%10;
      int divisor = (int)Math.pow(10,count-1);
      int first = num/divisor;
      
      int middle = (num%divisor)/10;
      System.out.println("middle number " + middle);
      int finalNumber = last*divisor+middle*10+first;
      
      System.out.println(finalNumber);
    }
    
}
