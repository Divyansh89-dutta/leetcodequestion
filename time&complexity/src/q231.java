class Solution321 {
    public boolean isPowerOfTwo(int n) {
        if(n == 1) return true;
        if(n <= 0 || n % 2 != 0) return false;
        return isPowerOfTwo(n / 2);
    }
}
public class q231 {
    public static void main(String[] args) {

        Solution231 sol = new Solution231();

        System.out.println(sol.isPowerOfTwo(16)); // true
        System.out.println(sol.isPowerOfTwo(3));  // false
        System.out.println(sol.isPowerOfTwo(1));  // true
        System.out.println(sol.isPowerOfTwo(0));  // false
    }
}
