class solution33{
    public int search(int[] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) return i;
        }
        return -1;
    }
}
public class q33 {
    static void main(String[] args) {
        solution33 sol = new solution33();
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;

        System.out.println(sol.search(nums, target));
    }
}
