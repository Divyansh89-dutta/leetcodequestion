import java.util.Arrays;

class Solution5 {
    public boolean divideArray(int[] nums) {

        // If length is odd, cannot form pairs
        if (nums.length % 2 != 0) return false;

        Arrays.sort(nums);

        // Jump by 2 because we check pairs
        for (int i = 0; i < nums.length; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return false;
            }
        }
        return true;
    }
}

public class q2206 {
    public static void main(String[] args) {
        Solution5 sol = new Solution5();
        int[] nums = {3, 1, 3, 2, 2, 2};
        System.out.println(sol.divideArray(nums)); // true
    }
}
