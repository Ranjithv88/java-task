import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        // First two numbers in the Fibonacci sequence
        int a = 0, b = 1;

        System.out.print("Fibonacci Series: ");

        // Print the first term
        if (n >= 1) {
            System.out.print(a + " ");
        }

        // Print the second term
        if (n >= 2) {
            System.out.print(b + " ");
        }

        // Calculate and print the rest of the terms
        for (int i = 3; i <= n; i++) {
            int nextTerm = a + b;
            System.out.print(nextTerm + " ");
            a = b;  // Move a to b
            b = nextTerm;  // Move b to nextTerm
        }
    }
}

