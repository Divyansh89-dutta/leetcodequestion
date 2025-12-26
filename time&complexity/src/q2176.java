class Solution2176 {
    public int countPairs(int[] nums, int k) {
        int pairs = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                // Check equal values and divisibility condition
                if (nums[i] == nums[j] && (i * j) % k == 0) {
                    pairs++;
                }
            }
        }
        return pairs;
    }
}

public class q2176 {
    public static void main(String[] args) {

        Solution2176 sol = new Solution2176();

        int[] nums = {3, 1, 2, 2, 2, 1, 3};
        int k = 2;

        System.out.println(sol.countPairs(nums, k));
    }
}
