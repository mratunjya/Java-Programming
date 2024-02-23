public class GridWays {
    public static int ways(int arr[][], int sr, int sc, int er, int ec) {
        if (sr >= er || sc >= ec) {
            return 0;
        }

        if (arr[sr][sc] == 1) {
            return 1;
        }

        return ways(arr, sr, sc + 1, er, ec) + ways(arr, sr + 1, sc, er, ec);
    }

    public static void main(String[] args) {
        int m = 5, n = 5;
        int arr[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[m - 1][n - 1] = 0;
            }
        }

        arr[m - 1][n - 1] = 1; // target

        int totalWays = ways(arr, 0, 0, m, n);

        System.out.println("Total Ways: " + totalWays);
    }
}
