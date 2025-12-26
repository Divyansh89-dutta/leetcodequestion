class Solution11 {
    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int maxWater = 0;

        while (left < right) {
            int h = Math.min(height[left], height[right]);
            int w = right - left;
            int area = h * w;

            maxWater = Math.max(maxWater, area);

            // Move the smaller height pointer
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxWater;
    }
}

public class q11 {
    public static void main(String[] args) {

        Solution11 sol = new Solution11();

        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(sol.maxArea(height));
    }
}
