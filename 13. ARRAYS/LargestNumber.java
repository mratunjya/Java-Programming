public class LargestNumber {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 6, 1, 9, 4 };

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

        System.out.println("Max: " + max);
    }
}

// Output: Max: 9