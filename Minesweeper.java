public class Minesweeper {

    private static void print2dArray(int[][] a) {
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

    public static int[][] makeNeighborBoard(boolean[][] board) {
        int bombCount = 0;
        int[][] result = new int[board.length][board[0].length];
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                if (board[r][c]) {
                    result[r][c] = -1;
                } else {
                    if (!board[r][c] && r != 0 && board[r-1][c]) {
                        bombCount++;
                    }
                    if (r != board.length-1 && !board[r][c] && board[r+1][c]) {
                        bombCount++;
                    }
                    if (!board[r][c] && c != 0 && board[r][c-1]) {
                        bombCount++;
                    }
                    if (c != board[0].length-1 && !board[r][c] && board[r][c+1]) {
                        bombCount++;
                    }
                    if (c != 0 && r != 0 && !board[r][c] && board[r-1][c-1]) {
                        bombCount++;
                    }
                    if (c != board[0].length-1 && r != 0 && !board[r][c] && board[r-1][c+1]) {
                        bombCount++;
                    }
                    if (c != board[0].length-1 && r != board.length-1 && !board[r][c] && board[r+1][c+1]) {
                        bombCount++;
                    }
                    if (c != 0 && r != board.length-1 && !board[r][c] && board[r+1][c-1]) {
                        bombCount++;
                    }
                    result[r][c] = bombCount;
                    bombCount = 0;
                }
            }
        }
        return result;
    }

    public static void printNeighborBoard(int[][] board) {
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                if (board[r][c] == -1) {
                    System.out.print("* ");
                } else {
                    System.out.print(board[r][c]+" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //print2dArray(makeMineSweeperBoard(5, 4, .25));
        //printMinesweeperBoard(makeMineSweeperBoard(7, 7, .1));
        //print2dArray(makeNeighborBoard(makeMineSweeperBoard(5, 5, .15)));
        printNeighborBoard(makeNeighborBoard(makeMineSweeperBoard(50, 50, .15)));
    }
}
