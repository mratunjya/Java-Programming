public class Q4 {
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

    public int WaterTrapped(int arrBuildings[], int leftMaxBoundary[], int rightMaxBoundary[]) {
        int waterTrapped = 0;

        for (int i = 0; i < arrBuildings.length; i++)
            waterTrapped += Math.min(leftMaxBoundary[i], rightMaxBoundary[i]) - arrBuildings[i];

        return waterTrapped;
    }

    public static void main(String[] args) {
        int arrBuildings[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        int leftMaxBoundary[] = new int[arrBuildings.length];
        int rightMaxBoundary[] = new int[arrBuildings.length];

        Q4 ob = new Q4();
        ob.calculateLeftMaxBoundary(arrBuildings, leftMaxBoundary);
        ob.calculateRightMaxBoundary(arrBuildings, rightMaxBoundary);

        int waterTrapped = ob.WaterTrapped(arrBuildings, leftMaxBoundary, rightMaxBoundary);
        System.out.println("Water Trapped: " + waterTrapped);
    }
}
