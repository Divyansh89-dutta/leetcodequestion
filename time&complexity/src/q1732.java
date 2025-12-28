class solution1732{
    public int largestAltitude(int[] gain){
        int altitude = 0;
        int max = 0;
        for(int g : gain){
            altitude += g;
            max = Math.max(max, altitude);
        }
        return max;
    }
}
public class q1732 {
    static void main(String[] args) {
        solution1732 sol = new solution1732();
        int[] gain = {-5, 1, 5, 0, -7};
        System.out.println(sol.largestAltitude(gain));
    }
}
