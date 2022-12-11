public class AllPairs {
    static void printPairs(int arr[], int start, int end) {
        if(start > end) {
            return;
        }
        
        for(int i = start + 1; i <= end; i++) {
            System.out.print("(" + arr[start] + ", " + arr[i] + ") ");
        }

        System.out.println();
        printPairs(arr, start + 1, end);
    }
    public static void main(String[] args) {
        int arr[] = { 2, 3, 6, 9, 10 };
        printPairs(arr, 0, arr.length - 1);
    }
}
