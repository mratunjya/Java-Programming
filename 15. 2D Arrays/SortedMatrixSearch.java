public class SortedMatrixSearch {
    public static void main(String[] args) {
        int matrix[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };
        int startRow = 0, startCoulmn = matrix[0].length - 1, endRow = matrix.length - 1, endColumn = 0, key = 8;
        boolean flag = false;

        while (true) {
            if (matrix[startRow][startCoulmn] == key) {
                System.out.println("Key Found at index (" + startRow + ", " + startCoulmn + ")");
                flag = true;
            } else {
                if (startCoulmn != endColumn) {
                    int left = matrix[startRow][startCoulmn - 1];

                    if (left >= key) {
                        startCoulmn--;
                        continue;
                    }
                }

                if (startRow != endRow) {
                    int bottom = matrix[startRow + 1][startCoulmn];

                    if (bottom >= key) {
                        startRow++;
                        continue;
                    }
                }
            }
            break;
        }

        if (!flag)
            System.out.println("Key not found");
    }
}

// Output: Key not found