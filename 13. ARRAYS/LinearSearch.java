public class LinearSearch {
    static int SearchLinear(int arr[], int start, int end, int key) {
        for(int i = start; i <= end; i++) {
            if(arr[i] == key)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2, 3, 6, 9, 10};
        
        int index = SearchLinear(arr, 0, arr.length - 1, 12);

        String str = index == -1 ? "Key not found" : "Key found at index " + index;

        System.out.println(str);
    }
}