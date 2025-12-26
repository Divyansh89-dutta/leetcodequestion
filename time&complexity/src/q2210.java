class Solution7 {
    public int countHillValley(int[] nums) {
        int count = 0;
        int n = nums.length;

        for (int i = 1; i < n - 1; i++) {

            if (nums[i] == nums[i - 1]) continue;

            int left = i - 1;
            int right = i + 1;
            while (right < n && nums[right] == nums[i]) {
                right++;
            }

            if (right >= n) break;
            if ((nums[i] > nums[left] && nums[i] > nums[right]) ||
                    (nums[i] < nums[left] && nums[i] < nums[right])) {
                count++;
            }
        }
        return count;
    }
}

public class q2210 {
    static void main(String[] args) {
        Solution7 sol = new Solution7();
        int[] nums = {2, 4, 1, 1, 6, 5};
        int result = sol.countHillValley(nums);
        System.out.println(result);
    }
}