public class InversionCount {
    static int count = 0;

    public static void divide(int arr[], int si, int ei) {
        if (si == ei) {
            return;
        }

        int mid = (si + ei) / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);

        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int i = si, j = mid + 1, k = 0;
        int temp[] = new int[ei - si + 1];

        while (i <= mid && j <= ei) {
            if (arr[j] > arr[i]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                count += mid - i + 1;
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        for (i = 0, j = si; i < ei - si + 1; i++, j++) {
            arr[j] = temp[i];
        }
    }

    public static int calculateInversionCount(int arr[]) {
        divide(arr, 0, arr.length - 1);

        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 3, 2, 1 };

        System.out.println(calculateInversionCount(arr));
    }
}
