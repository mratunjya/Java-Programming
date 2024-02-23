import java.util.Stack;

public class NextGreater {
    public static void nextGreater(int arr[], Stack<Integer> s, int nxtGtr[]) {
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] < arr[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                nxtGtr[i] = -1; // Use add(0, ...) to insert at the beginning of the list
            } else {
                nxtGtr[i] = arr[s.peek()]; // Use add(0, ...) to insert at the beginning of the list
            }

            s.push(i);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 8, 0, 1, 3 };
        Stack<Integer> s = new Stack<>();
        int nxtGtr[] = new int[arr.length];

        nextGreater(arr, s, nxtGtr);

        // Print the next greater elements
        for (int i = 0; i < nxtGtr.length; i++) {
            System.out.print(nxtGtr[i] + " ");
        }
    }
}