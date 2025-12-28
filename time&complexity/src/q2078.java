class solution2078{
    public int maxDistance(int[] colors){
        int max = 0;
        for (int i = 0; i < colors.length; i++) {
            for (int j = i + 1; j < colors.length; j++) {
                if (colors[i] != colors[j]) {
                    max = Math.max(max, j - i);
                }
            }
        }
        return max;
    }
}
public class q2078 {
    static void main() {
        solution2078 sol = new solution2078();
        int[] colors =  {1, 1, 1, 6, 1, 1, 1};
        System.out.println(sol.maxDistance(colors));
    }
}
