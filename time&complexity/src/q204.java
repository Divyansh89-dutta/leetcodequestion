import java.util.Arrays;

class solution204{
    public int countPrime(int n){
        if (n <= 2) return 0;
        boolean[] isPrine = new boolean[n];
        Arrays.fill(isPrine, true);
        isPrine[0] = false;
        isPrine[1] = false;
        for (int i = 2; i * i < n; i++) {
            if (isPrine[i]){
                for (int j = i * i; j < n; j++) {
                    isPrine[j] = false;
                }
            }
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrine[i]) count++;
        }
        return count;
    }
}
public class q204 {
    static void main(String[] args) {
        solution204 sol = new solution204();
        int n = 10;
        System.out.println(sol.countPrime(n));
    }
}
