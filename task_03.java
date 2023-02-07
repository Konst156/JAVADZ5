public class task_03 {
    static int[] board = new int[8];
    public static void main(String[] args) {
        placeQueens(0);
    }
    public static void placeQueens(int row) {
        if (row == 8) {
            printBoard();
            return;
        }
        for (int i = 0; i < 8; i++) {
            board[row] = i;
            if (isValid(row)) {
                placeQueens(row + 1);
            }
        }
    }
    public static boolean isValid(int row) {
        for (int i = 0; i < row; i++) {
            if (board[i] == board[row] || Math.abs(board[i] - board[row]) == Math.abs(i - row)) {
                return false;
            }
        }
        return true;
    }
    public static void printBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i] == j) {
                    System.out.print("X ");
                } else {
                    System.out.print("O ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}