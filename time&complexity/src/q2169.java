class Solution2169 {
    public int countOperations(int num1, int num2) {
        int count = 0;

        while (num1 != 0 && num2 != 0) {
            if (num1 >= num2) {
                num1 -= num2;
            } else {
                num2 -= num1;
            }
            count++;
        }
        return count;
    }
}

public class q2169 {
    public static void main(String[] args) {

        Solution2169 sol = new Solution2169();

        int num1 = 5;
        int num2 = 4;

        System.out.println(sol.countOperations(num1, num2));
    }
}
