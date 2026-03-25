public class NQueens {
    // check for an safe way
    public static boolean isSafe(char[][] board, int row, int col) {
        // vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // diagonal left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;

    }

    public static int count = 0;

    public static boolean Nqueen(char board[][], int row) {
        // base case
        if (row == board.length) {
            count++;
            return true;
        }
        // for column
        for (int j = 0; j < board.length; j++) {
            board[row][j] = 'Q';
            if (Nqueen(board, row + 1)) {
                return true;
            } // function call
            board[row][j] = 'X'; // backtraking step

        }
        return false;
    }

    public static void print(char board[][]) {
        System.out.println("-------chess board-------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        // intializing the chess board
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 'X';
            }
            System.out.println();
        }

        if (Nqueen(board, 0)) {
            System.out.println("Solution is possible:");
            print(board);
        } else {
            System.out.println("Solution is not possible.");
        }

        // System.out.print("total ways to solve this N queen's:"+count);

    }
}