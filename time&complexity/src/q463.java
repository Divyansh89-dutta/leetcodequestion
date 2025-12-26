class Solution463 {
    public int islandPerimeter(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int perimeter = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (grid[i][j] == 1) {
                    // Each land adds 4
                    perimeter += 4;

                    // Check top neighbor
                    if (i > 0 && grid[i - 1][j] == 1) {
                        perimeter -= 2;
                    }

                    // Check left neighbor
                    if (j > 0 && grid[i][j - 1] == 1) {
                        perimeter -= 2;
                    }
                }
            }
        }
        return perimeter;
    }
}

public class q463 {
    public static void main(String[] args) {

        Solution463 sol = new Solution463();

        int[][] grid = {
                {0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}
        };

        System.out.println(sol.islandPerimeter(grid)); // Output: 16
    }
}
