public class Q2 {
    public int TargetInNums(int nums[], int target) {
        for (int i = 0; i < nums.length; i++)
            if (nums[i] == target)
                return i;

        return -1;
    }

    public static void main(String[] args) {
        int nums[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;

        Q2 ob = new Q2();
        int targetInNums = ob.TargetInNums(nums, target);

        System.out.println("Output: " + targetInNums);
    }
}
