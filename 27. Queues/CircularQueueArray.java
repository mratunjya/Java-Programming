import java.util.*;

public class CircularQueueArray {
    static class Queue {
        int arr[];
        int size;
        int rear;
        int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = front = -1;
        }

        public boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public boolean isFull() {
            return (rear + 1) % size == front;
        }

        public void enQueue(int data) {
            if (isFull()) {
                System.out.println("Full Queue");
                return;
            }

            if(front == -1) {
                front = 0;
            }

            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public int deQueue() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }

            int data = arr[front];

            if(front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % size;
            }

            return data;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }

            return arr[front];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Queue Size: ");
        int size = sc.nextInt();

        Queue queue = new Queue(size);

        while (true) {
            System.out.println();
            System.out.println("************");
            System.out.println("1. Enque");
            System.out.println("2. Deque");
            System.out.println("3. Peek");
            System.out.println("4. Exit");
            System.out.println();

            int choice = sc.nextInt();
            int data;

            switch (choice) {
                case 1:
                    System.out.print("Enter data to enque: ");
                    data = sc.nextInt();
                    queue.enQueue(data);
                    break;
                case 2:
                    data = queue.deQueue();
                    System.out.println("Dequed: " + data);
                    break;
                case 3:
                    data = queue.peek();
                    System.out.println("Peek: " + data);
                    break;
                case 4:
                    sc.close();
                    return;
                default:
                    System.out.println("Wrong Input");
            }
        }
    }
}
