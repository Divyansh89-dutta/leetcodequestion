import java.util.Arrays;

class Solution6 {
    public int[] numberOfPairs(int[] nums) {
        Arrays.sort(nums);

        int pairs = 0;
        int n = nums.length;

        for (int i = 0; i < n - 1; i += 2) {
            if (nums[i] == nums[i + 1]) {
                pairs++;
            } else {
                // if no pair, move one step back so next element is checked
                i--;
            }
        }

        int leftovers = n - (2 * pairs);
        return new int[]{pairs, leftovers};
    }
}

public class q2341 {
    public static void main(String[] args) {
        Solution6 sol = new Solution6();
        int[] nums = {1, 3, 2, 1, 3, 2, 2};

        int[] result = sol.numberOfPairs(nums);
        System.out.println(Arrays.toString(result));
    }
}
