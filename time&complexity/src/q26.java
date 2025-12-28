import java.util.Arrays;

class  solution26{
    public int removeDuplicates(int[] nums){
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
public class q26 {
    static void main(String[] args) {
        solution26 sol = new solution26();
        int[] nums = {1, 1, 2, 2, 3};

        int k = sol.removeDuplicates(nums);

        System.out.println("Length after removing duplicates: " + k);
        System.out.println("Modified array: " + Arrays.toString(Arrays.copyOf(nums, k)));
    }
}
