import java.util.HashSet;

class Solution2357 {
    public int minimumOperations(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (n > 0)
                set.add(n);
        }
        return set.size();
    }
}
public class q2357  {
    public static void main(String[] args) {

        Solution2357 sol = new Solution2357();

        int[] nums = {1, 5, 0, 3, 5};

        System.out.println(sol.minimumOperations(nums));
    }
}
