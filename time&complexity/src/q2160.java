import java.util.Arrays;

class solution2160{
    public int minimumSum(int nums){
        int[] d = new int[4];
        for (int i = 0; i < 4; i++) {
            d[i] = nums % 10;
            nums /= 10;
        }
        Arrays.sort(d);
        int n1 = d[0] * 10 + d[2];
        int n2 = d[1] * 10 + d[3];
        return n1 + n2;
    }
}
public class q2160 {
    static void main(String[] args) {
        solution2160 sol = new solution2160();
        int nums = 2932;
        System.out.println(sol.minimumSum(nums));
    }
}
