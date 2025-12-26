class Solution1 {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        for(int i = 0;i < nums.length;i++){
            sum = sum + nums[i];
            nums[i] = sum;
        }
        return nums;
    }
}
public class q1480 {
    static void main() {

    }
}
