import java.util.ArrayList;
import java.util.Stack;

public class StockSpan {
    public static void maxCheck(Stack<Integer> max, ArrayList<Integer> span, int arr[], int i) {
        if (max.isEmpty()) {
            max.push(i);
            span.add(i + 1);
            return;
        }

        if (arr[max.peek()] > arr[i]) {
            span.add(i - max.peek());
            max.push(i);
            return;
        }

        max.pop();
        maxCheck(max, span, arr, i);
    }

    public static void calculateSpan(Stack<Integer> max, ArrayList<Integer> span, int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            maxCheck(max, span, arr, i);
            System.out.println("max: " + max);
            System.out.println("span: " + span);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Stack<Integer> max = new Stack<>();
        ArrayList<Integer> span = new ArrayList<>();
        int arr[] = { 100, 80, 60, 70, 60, 85, 100 };

        calculateSpan(max, span, arr);
    }
}
