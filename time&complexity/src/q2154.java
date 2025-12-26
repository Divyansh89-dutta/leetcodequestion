class Solution2154 {
    public int findFinalValue(int[] nums, int original) {
        boolean found = true;
        while(found){
            found = false;
            for(int n : nums){
                if(n == original){
                    original = original * 2;
                    found = true;
                    break;
                }
            }
        }
        return original;
    }
}
public class q2154 {
    public static void main(String[] args) {

        Solution2154 sol = new Solution2154();

        int[] nums = {5, 3, 6, 1, 12};
        int original = 3;

        System.out.println(sol.findFinalValue(nums, original));
    }
}
