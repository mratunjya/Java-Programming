public class MaxSumSubArray {
    static void printSubArrays (int arr[], int start, int end) {
        int max = Integer.MIN_VALUE, S = 0;
        for(int i = start; i <= end; i++) {
            for(int j = i; j <=end; j++) {
                for(int k = i; k <=j; k++) {
                    S += arr[k];
                    System.out.print(arr[k] + " ");
                }
                if(max < S)
                    max = S;
                S = 0;
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("Max sum of Sub Array: " + max);
    }
    public static void main(String[] args) {
        int arr[] = {2, 3, 6, 9, 10};
        printSubArrays(arr, 0, arr.length - 1);
    }
}
