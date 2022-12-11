public class LinearSearch {
    static int searchLinear(int arr[], int start, int end, int key) {
        for (int i = start; i <= end; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 6, 9, 10 };

        int index = searchLinear(arr, 0, arr.length - 1, 12);

        String str = index == -1 ? "Key not found" : "Key found at index " + index;

        System.out.println(str);
    }
}

// Output: Key not found