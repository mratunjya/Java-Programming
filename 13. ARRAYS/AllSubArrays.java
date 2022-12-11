public class AllSubArrays {
    static void printSubArrays(int arr[], int start, int end) {
        for (int i = start; i <= end; i++) {
            for (int j = i; j <= end; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 6, 9, 10 };
        printSubArrays(arr, 0, arr.length - 1);
    }
}

// Output:
// 2
// 2 3
// 2 3 6
// 2 3 6 9
// 2 3 6 9 10
//
// 3
// 3 6
// 3 6 9
// 3 6 9 10
//
// 6
// 6 9
// 6 9 10
//
// 9
// 9 10
//
// 10