class Solution2293{
    public int minMaxGame(int[] nums){
        while(nums.length > 1){
            int[] newArr = new int[nums.length / 2];
            for (int i = 0; i < newArr.length; i++) {
                if (i % 2 == 0){
                    newArr[i] = Math.min(nums[2 * i], nums[2 * i + 1]);
                } else {
                    newArr[i] = Math.max(nums[2 * i], nums[2 * i + 1]);
                }
            }

            nums = newArr;
        }
        return nums[0];
    }
}
public class q2293 {
    static void main(String[] args) {
        Solution2293 sol = new Solution2293();
        int[] nums = {1, 3, 5, 2, 4, 8, 2, 2};
        System.out.println(sol.minMaxGame(nums));
    }
}
