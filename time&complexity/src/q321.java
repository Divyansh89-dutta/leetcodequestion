class Solution231 {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}

public class q321 {
    public static void main(String[] args) {

        Solution231 sol = new Solution231();

        System.out.println(sol.isPowerOfTwo(1));   // true
        System.out.println(sol.isPowerOfTwo(16));  // true
        System.out.println(sol.isPowerOfTwo(3));   // false
        System.out.println(sol.isPowerOfTwo(0));   // false
    }
}
