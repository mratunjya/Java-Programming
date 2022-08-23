public class BinarySearchIterative {
    static int FunBinarySearchIterative(int arr[], int n) {
        int lb = 0, ub = arr.length - 1;

        while (lb <= ub) {
            int mid = (lb + ub) / 2;
            if (arr[mid] == n) {
                return mid;
            } else if (arr[mid] < n) {
                lb = mid + 1;
            } else {
                ub = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String args[]) {
        int arr[] = {2, 4, 6, 8, 10, 12, 14}, n = 12;

        int i = FunBinarySearchIterative(arr, n);

        System.out.println("Number is present at index " + i);
    }
}
