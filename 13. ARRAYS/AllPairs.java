public class AllPairs {
    static void printPairs(int arr[], int start, int end) {
        if (start > end) {
            return;
        }

        for (int i = start + 1; i <= end; i++) {
            System.out.print("(" + arr[start] + ", " + arr[i] + ") ");
        }

        System.out.println();
        printPairs(arr, start + 1, end);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 6, 9, 10 };
        printPairs(arr, 0, arr.length - 1);
    }
}

// Output:
// (2, 3) (2, 6) (2, 9) (2, 10)
// (3, 6) (3, 9) (3, 10)
// (6, 9) (6, 10)
// (9, 10)
