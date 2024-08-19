
//Fibanocci Series
//Anaga Raghavan
//ROll NO;8
import java.util.*;
class Fibonacci
 {
    int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    int fibonacciNonRecursive(int n) {
        if (n <= 1) {
            return n;
        }

        int prev2 = 0;
        int prev1 = 1;
        int current = 0;

        for (int i = 2; i <= n; i++) {
            current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        return current;
    }

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n =S.nextInt();

        Fibonacci fibonacci = new Fibonacci();
        
        System.out.println("Fibonacci series using recursive method:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci.fibonacciRecursive(i) + " ");
        }

        System.out.println("\nFibonacci series using non-recursive method:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci.fibonacciNonRecursive(i) + " ");
        }
        S.close();
    }
}
/*PS C:\Users\devik\javafiles> javac Fibonacci.java
PS C:\Users\devik\javafiles> java Fibonacci
Enter the number of terms: 6
Fibonacci series using recursive method:
0 1 1 2 3 5 
Fibonacci series using non-recursive method:
0 1 1 2 3 5 
PS C:\Users\devik\javafiles> */
