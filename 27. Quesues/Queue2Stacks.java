import java.util.Scanner;
import java.util.Stack;

public class Queue2Stacks {
    static class Queue {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        public boolean isEmpty() {
            return s2.isEmpty();
        }

        public void enqueue(int data) {
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }

            s1.push(data);

            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        public int dequeue() {
            if (isEmpty()) {
                return -1;
            } else {
                return s2.pop();
            }
        }

        public int peek() {
            if (isEmpty()) {
                return -1;
            } else {
                return s2.peek();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue queue = new Queue();

        while (true) {
            System.out.println();
            System.out.println("************");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Exit");
            System.out.println();

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter an integer to enqueue: ");
                    int data = scanner.nextInt();
                    queue.enqueue(data);
                    break;
                case 2:
                    System.out.println("Dequeued: " + queue.dequeue());
                    break;
                case 3:
                    System.out.println("Peek: " + queue.peek());
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
