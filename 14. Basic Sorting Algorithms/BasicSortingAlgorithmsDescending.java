import java.util.*;

public class BasicSortingAlgorithmsDescending {
    public static void bubbleSort(int arr[], int size) {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void selectionSort(int arr[], int size) {
        for (int i = 0; i < size - 1; i++) {
            int maxPos = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[maxPos] < arr[j]) {
                    maxPos = j;
                }
            }

            if (i != maxPos) {
                int temp = arr[i];
                arr[i] = arr[maxPos];
                arr[maxPos] = temp;
            }
        }
    }

    public static void insertionSort(int arr[], int size) {
        for (int i = 1; i < size; i++) {
            int curr = arr[i], prev = i - 1;

            while (prev >= 0 && arr[prev] < curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            arr[prev + 1] = curr;
        }
    }

    public static void countingSort(int arr[], int size) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

        int freqSize = max + 1;
        int freq[] = new int[freqSize];

        for (int i = 0; i < size; i++) {
            freq[arr[i]]++;
        }

        int index = 0;
        for (int i = freqSize - 1; i > 0; i--) {
            for (int j = 0; j < freq[i]; j++) {
                arr[index++] = i;
            }
            freq[i] = 0;
        }
    }

    public static void PrintArray(int arr[]) {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        int size = arr.length;

        System.out.println("Bubble Sort");
        bubbleSort(arr, size);
        PrintArray(arr);

        System.out.println("Selection Sort");
        selectionSort(arr, size);
        PrintArray(arr);

        System.out.println("Insertion Sort");
        insertionSort(arr, size);
        PrintArray(arr);

        System.out.println("Counting Sort");
        countingSort(arr, size);
        PrintArray(arr);
    }
}

// Output:
// Bubble Sort
// [5, 4, 3, 2, 1]
// Selection Sort
// [5, 4, 3, 2, 1]
// Insertion Sort
// [5, 4, 3, 2, 1]
// Counting Sort
// [5, 4, 3, 2, 1]