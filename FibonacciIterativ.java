public class FibonacciIterativ
{
    public int fibIterativ(int n) {
        int i;
        int x1 = 1; // Speicherplatz für fib(n)
        int x2 = 1; // Speicherplatz für fib(n-1)
        for(i=0; i<n; i++) {
        int x3 = x2; // Merkt sich fib(n-1)
        x2 = x1 + x2; 
        x1 = x3;
        }
        return x1;
    }
}
