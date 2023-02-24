public class SelfAvoidingWalk {

    public static void printPathLengths(int n, int trials) {
        boolean[][] grid = new boolean[n][n];
        int x = n/2;
        int y = n/2;

        while (x >= 0 && x < n && y >= 0 && y < n && grid[x][y]) {
            grid[x][y] = false;

            
        }
    }

    public static void main(String[] args) {
        
    }
}
