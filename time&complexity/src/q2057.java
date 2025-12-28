class solution2057{
    public int smallestEqual(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            if (i % 10 == nums[i]) {
                return i;
            }
        }
        return -1;
    }
}
public class q2057 {
    static void main(String[] args) {
     solution2057 sol = new solution2057();
     int[] nums = {0,1,2};
        System.out.println(sol.smallestEqual(nums));
    }
}
