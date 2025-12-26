class Solution9 {
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            // Compare current element with next (circular)
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }

            // More than one break → not sorted & rotated
            if (count > 1) {
                return false;
            }
        }
        return true;
    }
}

public class q1752 {
    public static void main(String[] args) {

        Solution9 sol = new Solution9();

        int[] nums1 = {3, 4, 5, 1, 2};
        int[] nums2 = {2, 1, 3, 4};

        System.out.println(sol.check(nums1)); // true
        System.out.println(sol.check(nums2)); // false
    }
}
