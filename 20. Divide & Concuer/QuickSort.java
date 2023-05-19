import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int arr[], int start, int end) {
        if (start >= end)
            return;

        int pivotIndex = partition(arr, start, end);
        quickSort(arr, start, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, end);
    }

    public static int partition(int arr[], int start, int end) {
        int i = start - 1;
        int pivot = end;

        for (int j = start; j < end; j++) {
            if (arr[j] < arr[pivot]) {
                ++i;
                int temp = arr[i];
                arr[i] = arr[j];    
                arr[j] = temp;
            }
        }

        ++i;
        int temp = arr[i];
        arr[i] = arr[pivot];
        arr[pivot] = temp;

        return i;
    }

    public static void main(String[] args) {
        int arr[] = { 9, 5, 1, 3, 7, 9, 4 };

        quickSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }
}
