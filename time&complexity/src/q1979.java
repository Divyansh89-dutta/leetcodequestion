class Solution1979 {
    public int findGCD(int[] nums) {

        int min = nums[0];
        int max = nums[0];

        // Find min and max
        for (int n : nums) {
            if (n < min) min = n;
            if (n > max) max = n;
        }

        // Find GCD of min and max
        return gcd(min, max);
    }

    // Euclidean Algorithm
    private int gcd(int a, int b) {
        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }
}

public class q1979 {
    public static void main(String[] args) {

        Solution1979 sol = new Solution1979();

        int[] nums = {2, 5, 6, 9, 10};
        System.out.println(sol.findGCD(nums));
    }
}
