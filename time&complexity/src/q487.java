class solution487{
    public int findMaxConsecutiveOnes(int[] nums){
        int maxLen = 0;
        for (int i = 0; i < nums.length; i++) {
            int zeroCount = 0;
            int currentLen = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == 0){
                    zeroCount++;
            }
                if (zeroCount > 1){
                    break;
                }
                currentLen++;
        }
            maxLen = Math.max(maxLen, currentLen);
    }
        return maxLen;
}
public class q487 {
    static void main(String[] args) {
        solution487 sol = new solution487();
        int[] nums = {1,0,1,1,0};
        System.out.println(sol.findMaxConsecutiveOnes(nums));
    }
}
}
