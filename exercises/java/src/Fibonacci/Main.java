package Fibonacci;

public class Main {
    public static void main(String[] args) {
        // using loop
        System.out.println("Fibonacci of 18 using loop is: " + calculateFibonacciWithLoop(18));

        // using recursive
        System.out.println("Fibonacci of 18 using recursive is: " + calculateFibonacciWithRecursive(0, 1, 18));

        // Finding The n^th Fibonacci Number Using Recursion
        // This formula uses a 0-based index. This means that to generate the 20th Fibonacci number, we must write F(19).
        System.out.println("Fibonacci of 18 is: " + calculateNthFibonacciWithRecursion(17));
    }

    // using loop
    private static int calculateFibonacciWithLoop(int times) {
        int prev = 0;
        int current = 1;
        int result = 0;

        for (int i = 0; i < times; i++) {
            result = prev + current;
            prev = current;
            current = result;
        }
        return result;
    }

    // using recursive
    private static int calculateFibonacciWithRecursive(int prev, int current, int times) {
        if (times <= 0) return current;

        return calculateFibonacciWithRecursive(current, prev + current, --times);
    }

    // Finding The n^th Fibonacci Number Using Recursion
    // Math Formula is  F(n) = F(n-1) + F(n-2)
    // This formula uses a 0-based index. This means that to generate the 20th Fibonacci number, we must write F(19).
    private static int calculateNthFibonacciWithRecursion(int times) {
        if (times <= 0) return 1;

        return calculateNthFibonacciWithRecursion(times - 1) + calculateNthFibonacciWithRecursion(times - 2);
    }
}
