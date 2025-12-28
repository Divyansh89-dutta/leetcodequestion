class Solution2399 {
    public boolean checkDistances(String s, int[] distance) {

        int[] first = new int[26];

        // initialize with -1 (not seen)
        for (int i = 0; i < 26; i++) first[i] = -1;

        for (int i = 0; i < s.length(); i++) {

            int index = s.charAt(i) - 'a';

            // first occurrence
            if (first[index] == -1) {
                first[index] = i;
            }
            // second occurrence
            else {
                if (i - first[index] - 1 != distance[index]) {
                    return false;
                }
            }
        }
        return true;
    }
}

public class q2399 {
    public static void main(String[] args) {

        Solution2399 sol = new Solution2399();

        String s = "abaccb";
        int[] distance = {1,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

        System.out.println(sol.checkDistances(s, distance));
    }
}
