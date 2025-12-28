import java.util.Arrays;

class Solution2037{
    public int minMovesToSeat(int[] seats, int[] student){
        Arrays.sort(seats);
        Arrays.sort(student);
        int moves = 0;
        for (int i = 0; i < seats.length; i++) {
            moves += Math.abs(seats[i] - student[i]);
        }
        return moves;
    }
}
public class q2037 {
    static void main(String[] args) {
        Solution2037 sol = new Solution2037();
        int[] seats = {3,1,5};
        int[] students = {2,7,4};
        System.out.println(sol.minMovesToSeat(seats,students));
    }
}
