public class SortedArray {
    public static boolean isSorted(int arr[], int i) {
        if (i >= arr.length - 1)
            return true;

        if (arr[i] < arr[i + 1])
            return isSorted(arr, i + 1);
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(isSorted(new int[] { 1, 2, 3, 4}, 0));
    }
}
