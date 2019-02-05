// 136. Write a Java program to find possible unique paths from top-left corner to bottom-right corner of a given grid (m x n). Go to the editor
// Note: You can move either down or right at any point in time.
// Sample Output: Unique paths from top-left corner to bottom-right corner of the said grid: 3
import java.util.*;

public class basic136{
    public static void main(String[] args){
        run();
    }
    public static void run(){
      int m = 3;
      int n = 2;
      System.out.println("Unique paths from top-left corner to bottom-right corner of the said grid: " + unique_Paths(m, n));
    }
    public static int unique_Paths(int m, int n){
      if (m <= 0 || n <= 0) {
        return 0;
      }
      int[][] grid = new int[m][n];
      for (int i = m - 1; i >= 0; --i){
        for (int j = n - 1; j >= 0; --j){
          grid[i][j] = get_Paths(grid, i, j);
        }
      }
      return grid[0][0];
    }
    private static int get_Paths(int[][] grid, int i, int j){
      if (i >= grid.length - 1 || j >= grid[0].length - 1){
        return 1;
      }
        return grid[i][j + 1] + grid[i + 1][j];
    }
}
