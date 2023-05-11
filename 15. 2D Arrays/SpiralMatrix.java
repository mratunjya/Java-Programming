public class SpiralMatrix {
    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 }, { 12, 13, 14, 5 }, { 11, 16, 15, 6 }, { 10, 9, 8, 7 } };
        int startRow = 0, endRow = matrix.length, startColumn = 0, endColumn = matrix[0].length;

        while (startRow <= endRow && startColumn <= endColumn) {
            for (int i = startColumn; i < endColumn; i++) {
                System.out.print(matrix[startRow][i] + " ");
            }

            for (int i = startRow + 1; i < endRow - 1; i++) {
                System.out.print(matrix[i][endColumn - 1] + " ");
            }

            for (int i = endColumn - 1; i >= startColumn; i--) {
                System.out.print(matrix[endRow - 1][i] + " ");
            }

            for (int i = endRow - 2; i >= startRow + 1; i--) {
                System.out.print(matrix[i][startColumn] + " ");
            }

            startRow++;
            endRow--;
            startColumn++;
            endColumn--;
        }
    }
}
