public class Reverse {
    static void ArrayReverse(int arr[], int start, int end){
        if (start > end)
            return;
        int t = arr[start];
        arr[start] = arr[end];
        arr[end] = t;
        ArrayReverse(arr, ++start, --end);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 6, 9, 10 };

        ArrayReverse(arr, 0, arr.length - 1);

        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println(arr[i]);
        }
    }
}
