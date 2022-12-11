public class MaxSumSubArrayKadane {
    static void printSubArrays(int arr[], int start, int end) {
        int CS = 0;
        int max = Integer.MIN_VALUE;
        int minNegative = Integer.MIN_VALUE;
        boolean allNegative = true;

        for (int i = start; i <= end; i++) {
            CS = CS + arr[i];

            if (CS < 0)
                CS = 0;

            if (max < CS)
                max = CS;

            if (minNegative < arr[i] && arr[i] < 0)
                minNegative = arr[i];

            if (arr[i] > 0)
                allNegative = false;
        }

        int minORmax = allNegative ? minNegative : max;

        System.out.println("Max sum of Sub Array: " + minORmax);
    }

    public static void main(String[] args) {
        int arr[] = { 2, -3, 6, 9, -10 };

        printSubArrays(arr, 0, arr.length - 1);
    }
}
