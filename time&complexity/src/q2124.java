class Solution2124{
    public boolean checkString(String s){
        boolean seenB = false;
        for (char ch : s.toCharArray()){
            if (ch == 'b'){
                seenB = true;
            }
            if (ch == 'a' && seenB) {
                return false;
            }
        }
        return true;
    }
}
public class q2124 {
    static void main(String[] args) {
        Solution2124 sol = new Solution2124();
        System.out.println(sol.checkString("aaabbb"));
        System.out.println(sol.checkString("abab"));
    }
}
