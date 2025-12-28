class solution2309{
    public String greatestLetter(String s){
        boolean[] lower = new boolean[26];
        boolean[] upper = new boolean[26];
        for (char ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                lower[ch - 'a'] = true;
            } else if (ch >= 'A' && ch <= 'Z') {
                upper[ch - 'A'] = true;
            }
        }
        for (int i = 25; i >= 0; i--) {
            if (lower[i] && upper[i]) {
                return String.valueOf((char) ('A' + i));
            }
        }
        return "";
    }
}
public class q2309 {
    static void main(String[] args) {

    }
}
