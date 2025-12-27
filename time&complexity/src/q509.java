class Solution509{
    public int fib(int n){
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }
}
public class q509 {
    static void main(String[] args) {
        Solution509 sol = new Solution509();
        int n = 6;
        System.out.println("Fibonacci of " + n + " is: " + sol.fib(n));
    }
}
