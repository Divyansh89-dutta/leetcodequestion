class solution485{
    public int findMaxConsecutiveOnes(int[] nums){
        int max = 0;
        int current = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                current++;
                max = Math.max(max, current);
            } else {
                current = 0;
            }
        }
        return max;
    }
}
public class q485 {
    static void main(String[] args) {
        solution485 sol = new solution485();
        int[] nums = {1, 1, 0, 1, 1, 1};

        System.out.println(sol.findMaxConsecutiveOnes(nums));
    }
}
