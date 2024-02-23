import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Stack2Queues {
    static class Stack {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        public boolean isEmpty() {
            return q1.isEmpty();
        }

        public void enqueue(int data) {
            q1.add(data);
        }

        public int dequeue() {
            int pop = -1;

            while (!q1.isEmpty()) {
                pop = q1.remove();
                System.out.println(pop);
                if (!q1.isEmpty())
                    q2.add(pop);
            }

            while (!q2.isEmpty()) {
                q1.add(q2.remove());
            }

            return pop;
        }

        public int peek() {
            if (isEmpty()) {
                return -1;
            } else {
                return q1.peek();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack stack = new Stack();

        while (true) {
            System.out.println();
            System.out.println("************");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Exit");
            System.out.println();

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter an integer to enqueue: ");
                    int data = scanner.nextInt();
                    stack.enqueue(data);
                    break;
                case 2:
                    System.out.println("Popped: " + stack.dequeue());
                    break;
                case 3:
                    System.out.println("Peek: " + stack.peek());
                    break;
                case 4:
                    scanner.close();
                    return;
                default:
                    System.out.println("Wrong input");
            }
        }
    }
}
