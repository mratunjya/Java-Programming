import java.util.*;

public class BasicSortingAlgorithmsAscending {
    public static void BubbleSort(int arr[], int size) {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void SelectionSort(int arr[], int size) {
        for (int i = 0; i < size - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }

            if (i != minPos) {
                int temp = arr[i];
                arr[i] = arr[minPos];
                arr[minPos] = temp;
            }
        }
    }

    public static void InsertionSort(int arr[], int size) {
        for (int i = 1; i < size; i++) {
            int curr = arr[i], prev = i - 1;

            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            arr[prev + 1] = curr;
        }
    }

    public static void CountingSort(int arr[], int size) {
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
        for (int i = 0; i < freqSize; i++) {
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

        CountingSort(arr, size);
        PrintArray(arr);
    }
}