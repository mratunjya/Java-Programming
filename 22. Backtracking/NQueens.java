public class NQueens {
    static int count = 0;

    public static void printBoard(String board[][], int order) {
        System.out.println("--------------Combination------------------");
        for (int i = 0; i < order; i++) {
            for (int j = 0; j < order; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean isSafeCombination(String board[][], int row, int column, int order) {
        // for above
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][column] == "Q") {
                return false;
            }
        }

        // for diagonal left above
        for (int i = row - 1, j = column - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == "Q") {
                return false;
            }
        }

        // for diagonal right above
        for (int i = row - 1, j = column + 1; i >= 0 && j < order; i--, j++) {
            if (board[i][j] == "Q") {
                return false;
            }
        }

        return true;
    }

    public static boolean allCombinations(String board[][], int row, int order) {
        if (row == order) {
            ++count;
            printBoard(board, order);
            return true;
        }

        for (int i = 0; i < order; i++) {
            if (isSafeCombination(board, row, i, order)) {
                String temp = board[row][i];
                board[row][i] = "Q";
                if (allCombinations(board, row + 1, order)) {
                    return true;
                }
                board[row][i] = temp;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int order = 4;
        String board[][] = new String[order][order];

        for (int i = 0; i < order; i++) {
            for (int j = 0; j < order; j++) {
                board[i][j] = "x";
            }
        }

        allCombinations(board, 0, order);
        System.out.println("Count: " + count);
    }
}
