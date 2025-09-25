package JavaCoding.NumberReverseProblem;

import java.util.Scanner;

public class reverseNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int num = Integer.parseInt(sc.next());
       System.out.println(num);
       
       int temp =num;
       int result = 0;
       
       while(temp>0){
           result = result*10 + temp%10;
           temp = temp/10;
           
       }
       
       System.out.println("Reverse Number " + result);
    }
    
}
