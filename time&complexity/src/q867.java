import java.util.Arrays;

class solution867{
    public int[][] transpose(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }
}
public class q867 {
    static void main(String[] args) {
        solution867 sol = new solution867();

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] ans = sol.transpose(matrix);

        // Print transposed matrix
        for (int[] row : ans) {
            System.out.println(Arrays.toString(row));
        }
    }
}

