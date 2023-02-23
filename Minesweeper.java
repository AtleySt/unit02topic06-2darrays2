public class Minesweeper {

    private static void print2dArray(boolean[][] a) {
        for (int r=0; r < a.length; r++) {
          for (int c=0; c< a[r].length; c++) {
            System.out.print(a[r][c]);
            System.out.print(" ");
          }
          System.out.println();
        }
      }

    public static boolean[][] makeMineSweeperBoard(int m, int n, double p) {
        boolean[][] board = new boolean[m][n];
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                double bombChance = Math.random();
                if (bombChance <= p) {
                    board [r][c] = true;
                } else {
                    board [r][c] = false;
                }
            }
        }
        return board;
    }

    public static void printMinesweeperBoard(boolean[][] board) {
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                if (board[r][c]) {
                    System.out.print("* ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //print2dArray(makeMineSweeperBoard(5, 4, .25));
        printMinesweeperBoard(makeMineSweeperBoard(7, 7, .1));
    }
}
