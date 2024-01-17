public class Fibonacci {

    // Recursive method to calculate the nth term in the Fibonacci sequence
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        // Pass 10 as an argument to the fibonacci method
        int n = 10;
        int nthTerm = fibonacci(n);


        System.out.println("The " + n + "th term of the Fibonacci sequence is " + nthTerm + ".");
    }
}
