public class SortedRotatedArrayBinarySearch {
    public static void main(String[] args) {
        int nums[] = { 7, 8, 0, 1, 2, 3, 4, 5, 6 };
        int target = 0;
        int start = 0;
        int end = nums.length - 1;
        int targetIndex = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                targetIndex = mid;
                break;
            }

            if (nums[start] <= nums[mid]) {
                if (nums[start] <= target && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        System.out.println("targetIndex: " + targetIndex);
    }
}

// Output: targetIndex: 2