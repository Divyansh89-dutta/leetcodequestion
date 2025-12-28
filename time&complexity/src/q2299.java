class Solution2299 {
    public boolean strongPasswordCheckerII(String password) {

        if (password.length() < 8) return false;

        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        String special = "!@#$%^&*()-+";

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (i > 0 && ch == password.charAt(i - 1)) {
                return false; // no two same adjacent chars
            }

            if (Character.isLowerCase(ch)) hasLower = true;
            else if (Character.isUpperCase(ch)) hasUpper = true;
            else if (Character.isDigit(ch)) hasDigit = true;
            else if (special.indexOf(ch) != -1) hasSpecial = true;
        }

        return hasLower && hasUpper && hasDigit && hasSpecial;
    }
}

public class q2299 {
    public static void main(String[] args) {

        Solution2299 sol = new Solution2299();

        System.out.println(sol.strongPasswordCheckerII("IloveLeetCode2!")); // true
        System.out.println(sol.strongPasswordCheckerII("Me+You--IsMyDream")); // false
    }
}
