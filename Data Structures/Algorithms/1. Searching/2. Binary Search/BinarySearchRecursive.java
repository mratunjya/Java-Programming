public class BinarySearchRecursive {
    static int FunBinarySearchRecursive(int arr[], int lb, int ub, int n) {
        int mid = (lb + ub) / 2;
        if (lb > ub) {
            return -1;
        } else if (arr[mid] == n) {
            return mid;
        } else if (arr[mid] < n) {
            return FunBinarySearchRecursive(arr, mid + 1, ub, n);
        } else {
            return FunBinarySearchRecursive(arr, lb, mid - 1, n);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10, 12, 14 }, n = 6;
        int lb = 0, ub = arr.length - 1;
        int i = FunBinarySearchRecursive(arr, lb, ub, n);

        System.out.println("Number is present at index " + i);
    }
}
