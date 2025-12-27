class Solution242{
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] freq = new int[128];
        for(int i = 0;i < s.length();i++){
            freq[s.charAt(i)]++;
        }
        for (int i = 0; i < t.length(); i++){
            if(--freq[t.charAt(i)] < 0){
                return false;
            }
        }
        return true;
    }
}
public class q242 {
    public static void main(String[] args) {

        Solution242 sol = new Solution242();

        String s1 = "anagram";
        String t1 = "nagaram";

        String s2 = "rat";
        String t2 = "car";

        System.out.println(sol.isAnagram(s1, t1)); // true
        System.out.println(sol.isAnagram(s2, t2)); // false
    }
}
