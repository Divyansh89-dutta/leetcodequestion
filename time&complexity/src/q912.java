import java.util.Arrays;
class solution912{
    public int[] sortArray(int[] nums){
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }
    private void mergeSort(int[] nums, int left, int right){
        if (left >= right) return;
        int mid = left + (right - left) / 2;
        mergeSort(nums,left, mid);
        mergeSort(nums, mid +1, right);
        merge(nums, left, mid, right);
    }
    private void merge(int[] nums, int left, int mid, int right) {

        int[] temp = new int[right - left + 1];
        int i = left;     // pointer for left half
        int j = mid + 1;  // pointer for right half
        int k = 0;

        // Compare and merge
        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }

        // Copy remaining elements
        while (i <= mid) temp[k++] = nums[i++];
        while (j <= right) temp[k++] = nums[j++];

        // Copy back to original array
        for (int x = 0; x < temp.length; x++) {
            nums[left + x] = temp[x];
        }
    }
}
public class q912 {
    static void main(String[] args) {
        solution912 sol = new solution912();
        int[] nums = {5,2,3,1};
        sol.sortArray(nums);
        System.out.println(Arrays.toString(nums));
    }
}
