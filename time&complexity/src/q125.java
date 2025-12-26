class Solution125 {
    public boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            char l = s.charAt(left);
            char r = s.charAt(right);

            // Skip non-alphanumeric characters
            if (!Character.isLetterOrDigit(l)) {
                left++;
            } else if (!Character.isLetterOrDigit(r)) {
                right--;
            } else {
                // Compare lowercase characters
                if (Character.toLowerCase(l) != Character.toLowerCase(r)) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}

public class q125 {
    public static void main(String[] args) {

        Solution125 sol = new Solution125();

        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";

        System.out.println(sol.isPalindrome(s1)); // true
        System.out.println(sol.isPalindrome(s2)); // false
    }
}
