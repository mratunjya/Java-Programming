import java.util.Arrays;

public class MergeSort {
    public static void divide(int arr[], int p, int q) {
        if (p >= q) {
            return;
        }

        int mid = (p + q) / 2;
        divide(arr, p, mid);
        divide(arr, mid + 1, q);
        merge(arr, p, mid, q);
    }

    public static void merge(int arr[], int p, int mid, int q) {
        int s1 = p, s2 = mid + 1;
        int temp[] = new int[q - p + 1];
        int i = 0, j;

        while (s1 <= mid && s2 <= q) {
            if (arr[s1] < arr[s2]) {
                temp[i++] = arr[s1++];
            } else {
                temp[i++] = arr[s2++];
            }
        }

        while (s1 <= mid) {
            temp[i++] = arr[s1++];
        }

        while (s2 <= q) {
            temp[i++] = arr[s2++];
        }

        for (i = 0, j = p; i < q - p + 1; i++, j++) {
            arr[j] = temp[i];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 9, 5, 1, 3, 7, 9, 4 };
        divide(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }
}