class Solution2315 {
    public int countAsterisks(String s) {
        int count = 0;
        boolean insideBars = false;
        for (char ch : s.toCharArray()) {
            if (ch == '|') {
                insideBars = !insideBars;
            } else if (ch == '*' && !insideBars) {
                count++;
            }
        }
        return count;
    }
}
public class q2315 {
    static void main(String[] args) {
        Solution2315 sol = new Solution2315();
        String s = "l|*e*et|c**o|*de|";
        System.out.println(sol.countAsterisks(s));
    }
}
//| Char | insideBars | Count |   |
//        | ---- | ---------- | ----- | - |
//        | l    | false      | 0     |   |
//        |      |            | true  | 0 |
//        | *    | true       | ❌     |   |
//        | *    | true       | ❌     |   |
//        |      |            | false | 0 |
//        | *    | false      | ✅     |   |
//        | *    | false      | ✅     |   |
//        |      |            | true  | 2 |
