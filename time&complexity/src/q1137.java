class Solution1137 {
    public int tribonacci(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;

        int a = 0, b = 1, c = 1;

        for (int i = 3; i <= n; i++) {
            int d = a + b + c;
            a = b;
            b = c;
            c = d;
        }
        return c;
    }
}
public class q1137 {
    static void main(String[] args) {
        Solution1137 sol = new Solution1137();

        int n = 6;
        System.out.println(sol.tribonacci(n));
    }
}
