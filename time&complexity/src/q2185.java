class Solution2185 {
    public int prefixCount(String[] words, String pref) {

        int count = 0;
        int pLen = pref.length();

        for (String w : words) {
            if (w.length() >= pLen && w.startsWith(pref)) {
                count++;
            }
        }
        return count;
    }
}

public class q2185 {
    public static void main(String[] args) {

        Solution2185 sol = new Solution2185();

        String[] words = {"pay", "attention", "practice", "attend"};
        String pref = "at";

        System.out.println(sol.prefixCount(words, pref));
    }
}
