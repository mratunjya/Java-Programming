public class MaxSumSubArrayPrefix {
    static void createPrefixArray(int arr[], int start, int end, int prefixArr[]) {
        int S = 0;

        for (int i = start; i <= end; i++) {
            S += arr[i];
            prefixArr[i] = S;
        }
    }

    static void printSubArrays(int arr[], int start, int end, int prefixArr[]) {
        createPrefixArray(arr, 0, arr.length - 1, prefixArr);

        int max = Integer.MIN_VALUE, S = 0;
        for (int i = start; i <= end; i++) {
            for (int j = i; j <= end; j++) {
                S = i == 0 ? prefixArr[j] : prefixArr[j] - prefixArr[i - 1];
                if(max < S)
                    max = S;
            }
        }

        System.out.println("Max sum of Sub Array: " + max);
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 6, 9, 10};
        int prefixArr[] = new int[5];
        
        printSubArrays(arr, 0, arr.length - 1, prefixArr);
    }
}
