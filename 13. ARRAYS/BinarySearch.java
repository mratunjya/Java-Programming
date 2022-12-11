public class BinarySearch {
    static int searchBinary(int arr[], int start, int end, int key) {
        if (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                return searchBinary(arr, start, mid - 1, key);
            } else {
                return searchBinary(arr, mid + 1, end, key);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 6, 9, 10 };

        int index = searchBinary(arr, 0, arr.length - 1, 9);

        String str = index == -1 ? "Key not found" : "Key found at index " + index;

        System.out.println(str);
    }
}

// Output: Key found at index 3