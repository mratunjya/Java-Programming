class MajorityElement {
    // Helper method to count occurrences of an element in the array
    public static int count(int nums[], int ele) {
        int c = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == ele)
                ++c;
            continue;
        }

        return c;
    }

    // Recursive function to find the majority element in a subarray
    public static int countMajority(int nums[], int si, int ei) {
        // Base case: Only one element in the subarray, it is considered majority
        if (si == ei)
            return 1;

        int mid = (si + ei) / 2; // Find the middle index of the subarray

        int c = count(nums, nums[mid]); // Count occurrences of element at mid index in the entire array

        // If the count is greater than nums.length / 2, it is the majority element
        if (c > nums.length / 2) {
            return nums[mid];
        }

        // Recursive calls to find the majority element in the left and right halves
        int left = countMajority(nums, si, mid);
        int right = countMajority(nums, mid + 1, ei);

        // Return the larger of the two majority elements found in the subarrays
        return left > right ? left : right;
    }

    // Wrapper function to find the majority element in the entire array
    public static int majorityElement(int[] nums) {
        return countMajority(nums, 0, nums.length - 1);
    }

    public static void main(String[] args) {
        int nums[] = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println(majorityElement(nums));
    }
}
