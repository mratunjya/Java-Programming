import java.util.Stack;

public class MaximumRectangularArea {
    public static void calculateNextMinPrevMin(int height[], int nextMin[], int prevMin[]) {
        Stack<Integer> s = new Stack<>();
        for (int i = height.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && height[s.peek()] > height[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                nextMin[i] = -1;
            } else {
                nextMin[i] = s.peek();
            }

            s.push(i);
        }

        s.clear();

        for (int i = 0; i < height.length; i++) {
            while (!s.isEmpty() && height[s.peek()] > height[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                prevMin[i] = -1;
            } else {
                prevMin[i] = s.peek();
            }

            s.push(i);
        }
    }

    public static void main(String[] args) {
        int height[] = { 2, 1, 5, 6, 2, 3 };
        int nextMin[] = new int[height.length];
        int prevMin[] = new int[height.length];

        calculateNextMinPrevMin(height, nextMin, prevMin);

        int maxArea = -1;
        for (int i = 0; i < height.length; i++) {
            int rightMax = (nextMin[i] == -1 ? height.length : nextMin[i]) - 1;
            int leftMax = (prevMin[i] == -1 ? -1 : prevMin[i]) + 1;

            int area = (rightMax - leftMax) * height[i] + height[i];
            System.out.println(area);
            if(area > maxArea)
                maxArea = area;
        }
    }
}
