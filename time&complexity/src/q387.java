class Solution387{
    public int firstUniqChar(String s){
        int [] freq = new int[128];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i)] == 1) return i;
        }
        return  -1;
    }
}
public class q387 {
    static void main(String[] args) {
        Solution387 sol = new Solution387();
        String s = "leetcode";
        System.out.println(sol.firstUniqChar(s));
    }
}
