public class TrappingRainwater {
    public int trappingRainwater(int arrBuildings[]) {
        int l = arrBuildings.length;
        int leftMaxBoundary[] = new int[l];
        int rightMaxBoundary[] = new int[l];
        int leftMax = Integer.MIN_VALUE;
        int rightMax = Integer.MIN_VALUE;

        for (int i = 0; i < l; i++) {
            if (arrBuildings[i] > leftMax)
                leftMax = arrBuildings[i];
            leftMaxBoundary[i] = leftMax;

            if (arrBuildings[l - 1 - i] > rightMax)
                rightMax = arrBuildings[l - 1 - i];
            rightMaxBoundary[l - 1 - i] = rightMax;
        }

        int S = 0;
        for (int i = 0; i < l; i++) {
            int minOfMaxBoundaries = Math.min(leftMaxBoundary[i], rightMaxBoundary[i]);
            S += minOfMaxBoundaries - arrBuildings[i];
        }

        return S;
    }

    public static void main(String[] args) {
        int arrBuildings[] = { 2, 4, 6, 0, 9, 5, 3 };

        TrappingRainwater ob = new TrappingRainwater();
        int S = ob.trappingRainwater(arrBuildings);

        System.out.println("Rain Water Trapped = " + S);
    }
}
