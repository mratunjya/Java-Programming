public class TrappingRainWater {
    public static void main(String args[]) {
        int arr[] = { 4, 2, 0, 6, 3, 2, 5 };

        int left[] = new int[arr.length];
        int right[] = new int[arr.length];

        int t = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > t)
                t = arr[i];

            left[i] = t;
        }

        t = Integer.MIN_VALUE;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > t)
                t = arr[i];

            right[i] = t;
        }

        int water = 0;

        for (int i = 0; i < arr.length; i++) {
            water += Math.min(left[i], right[i]) - arr[i];
        }

        System.out.println("Water trapped = " + water);
    }
}