public class RotatedArray {
    public static int printTargetIndex(int arr[], int target, int si, int ei) {
        int mid = (si + ei) / 2;

        if (arr[mid] == target)
            return mid;

        if (arr[si] <= arr[mid]) {
            if (arr[si] <= target && target <= arr[mid]) {
                return printTargetIndex(arr, target, si, mid - 1);
            } else {
                return printTargetIndex(arr, target, mid + 1, ei);
            }
        } else {
            if (arr[mid] <= target && target <= arr[ei]) {
                return printTargetIndex(arr, target, mid + 1, ei);
            } else {
                return printTargetIndex(arr, target, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0 };
        int target = 0;

        System.out.println(printTargetIndex(arr, target, 0, arr.length - 1));
    }
}
