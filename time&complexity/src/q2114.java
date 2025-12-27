class Solution2117{
    public int mostWordsFound(String[] sentences){
        int max = 0;
        for (String s : sentences){
            int words = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' ') words++;
            }
            words = words + 1;
            max = Math.max(max, words);
        }
        return max;
    }
}
public class q2114 {
    static void main(String[] args) {
        Solution2117 sol = new Solution2117();
        String[] sentences = {
                "alice and bob love leetcode",
                "i think so too",
                "this is great thanks very much"
        };

        System.out.println(sol.mostWordsFound(sentences));
    }
}
