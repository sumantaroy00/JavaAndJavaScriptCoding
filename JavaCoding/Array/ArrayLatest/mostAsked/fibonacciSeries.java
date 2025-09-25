package JavaCoding.Array.ArrayLatest.mostAsked;

public class fibonacciSeries {

    public static void main(String[] args) {
        int n = 10; // Print first 10 Fibonacci numbers
        System.out.print("Fibonacci Series: ");
        printFibonacci(n);
    }

    public static void printFibonacci(int n) {
        int a = 0, b = 1;
        System.out.print(a + " " + b + " "); // Print first two numbers

        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
    
 }
} 
