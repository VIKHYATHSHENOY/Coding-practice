import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        System.out.println("Fibonacci series up to " + n + " terms:");

        // Print Fibonacci series up to n terms
        printFibonacciSeries(n);

        scanner.close();
    }

    // Method to print Fibonacci series up to n terms
    public static void printFibonacciSeries(int n) {
        int a = 0, b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            // Update a and b to the next two terms in the series
            int nextTerm = a + b;
            a = b;
            b = nextTerm;
        }
    }
}
