import java.util.Arrays;

public class KnigthTour {
    public static boolean isAllowed(int chessBoard[][], int i, int j) {
        return (i >= 0 && j >= 0 && i < chessBoard.length && j < chessBoard.length && chessBoard[i][j] == -1);
    }

    public static boolean moveKnight(int chessBoard[][], int count, int i, int j) {
        int iMoves[] = { 2, 2, 1, 1, -1, -1, -2, -2 };
        int jMoves[] = { 1, -1, 2, -2, 2, -2, 1, -1 };

        chessBoard[i][j] = count;
        if (count == chessBoard.length * chessBoard.length)
            return true;

        for (int k = 0; k < 8; k++) {
            int nextI = i + iMoves[k];
            int nextJ = j + jMoves[k];
            if (isAllowed(chessBoard, nextI, nextJ) && moveKnight(chessBoard, count + 1, nextI, nextJ))
                return true;
        }

        printChessBoard(chessBoard);
        chessBoard[i][j] = -1;

        return false;
    }

    public static void printChessBoard(int chessBoard[][]) {
        for (int i = 0; i < chessBoard.length; i++) {
            System.out.println(Arrays.toString(chessBoard[i]));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 8;
        int chessBoard[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                chessBoard[i][j] = -1;
            }
        }

        if (moveKnight(chessBoard, 0, 0, 0)) {
            printChessBoard(chessBoard);
        } else {
            System.out.println("Can't be solved");
        }
    }
}
