public class WaterTrapping {
    public void calculateLeftMaxBoundary(int arrBuildings[], int leftMaxBoundary[]) {
        int leftMax = Integer.MIN_VALUE;

        for (int i = 0; i < arrBuildings.length; i++) {
            if (leftMax < arrBuildings[i])
                leftMax = arrBuildings[i];

            leftMaxBoundary[i] = leftMax;
        }
    }

    public void calculateRightMaxBoundary(int arrBuildings[], int rightMaxBoundary[]) {
        int rightMax = Integer.MIN_VALUE;

        for (int i = arrBuildings.length - 1; i > 0; i--) {
            if (rightMax < arrBuildings[i])
                rightMax = arrBuildings[i];

            rightMaxBoundary[i] = rightMax;
        }
    }

    public int waterTrapped(int arrBuildings[], int leftMaxBoundary[], int rightMaxBoundary[]) {
        int trapped = 0;

        for (int i = 0; i < arrBuildings.length; i++)
            trapped += Math.min(leftMaxBoundary[i], rightMaxBoundary[i]) - arrBuildings[i];

        return trapped;
    }

    public static void main(String[] args) {
        int arrBuildings[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        int leftMaxBoundary[] = new int[arrBuildings.length];
        int rightMaxBoundary[] = new int[arrBuildings.length];

        WaterTrapping ob = new WaterTrapping();
        ob.calculateLeftMaxBoundary(arrBuildings, leftMaxBoundary);
        ob.calculateRightMaxBoundary(arrBuildings, rightMaxBoundary);

        int trapped = ob.waterTrapped(arrBuildings, leftMaxBoundary, rightMaxBoundary);
        System.out.println("Water Trapped: " + trapped);
    }
}

// Output: Water Trapped: 6