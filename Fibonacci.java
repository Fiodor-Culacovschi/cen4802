/**
 * The Fibonacci class contains methods to calculate the nth term in the Fibonacci sequence.
 */
public class Fibonacci {

    /**
     * Calculates the nth term in the Fibonacci sequence using recursion.
     *
     * @param n The position of the desired term in the Fibonacci sequence.
     * @return The nth term in the Fibonacci sequence.
     */
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    /**
     * Main method that calls the Fibonacci method with an argument of 10 and prints the result.
     *
     * @param args The command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Pass 10 as an argument to the fibonacci method
        int n = 10;
        int nthTerm = fibonacci(n);


        System.out.println("The " + n + "th term of the Fibonacci sequence is " + nthTerm + ".");
    }
}
