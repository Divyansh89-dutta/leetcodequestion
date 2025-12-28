import java.util.ArrayList;
import java.util.List;
import java.util.*;
class Solution2164{
    public int[] sortEvenOdd(int[] nums){
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                even.add(nums[i]);
            } else {
                odd.add(nums[i]);
            }
        }
        Collections.sort(even);
        Collections.sort(odd, Collections.reverseOrder());
        int e = 0, o = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0){
                nums[i] = even.get(e++);
            } else {
                nums[i] = odd.get(o++);
            }
        }
        return nums;
    }
}
public class q2164 {
    static void main(String[] args) {
        Solution2164 sol = new Solution2164();
        int[] nums = {4,1,2,3};
        System.out.println(Arrays.toString(sol.sortEvenOdd(nums)));
    }
}
//Problem (Very Simple Words)
////
////You are given an array nums.
////
////        Rules:
////
////Even indices (0, 2, 4, …) → sort in ascending order
////
////Odd indices (1, 3, 5, …) → sort in descending order
////
////Put the values back at their original index positions
//nums = [4, 1, 2, 3]
//values = [4, 2] → sort ascending → [2, 4]
//values = [1, 3] → sort descending → [3, 1]
////[2, 3, 4, 1]
//Separate numbers at even indices
//
//Separate numbers at odd indices
//
//Sort:
//
//even → ascending
//
//odd → descending
//
//Put them back into the array