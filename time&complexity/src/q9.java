class Solution4 {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        int rev = 0, org = x;
        while(x > 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        return org == rev;
    }
}
public class q9 {
    static void main() {
        Solution4 sol = new Solution4();

        System.out.println(sol.isPalindrome(121));   // true
        System.out.println(sol.isPalindrome(-121));  // false
        System.out.println(sol.isPalindrome(10));
    }
}
