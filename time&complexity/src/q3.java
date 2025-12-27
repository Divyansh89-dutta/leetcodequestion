import java.util.HashSet;

class Solutionq3 {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            // If duplicate found, shrink window from left
            while (set.contains(ch)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(ch);
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}

public class q3 {
    public static void main(String[] args) {

        Solutionq3 sol = new Solutionq3();

        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";

        System.out.println(sol.lengthOfLongestSubstring(s1)); // 3
        System.out.println(sol.lengthOfLongestSubstring(s2)); // 1
        System.out.println(sol.lengthOfLongestSubstring(s3)); // 3
    }
}
