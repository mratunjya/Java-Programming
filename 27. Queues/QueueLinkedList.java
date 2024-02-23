import java.util.Scanner;

public class QueueLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class Queue {
        Node front = null, tail = null;

        public boolean isEmpty() {
            return front == null;
        }

        public void enQueue(int data) {
            Node newNode = new Node(data);

            if (isEmpty()) {
                front = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        public int deQueue() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }

            int data = front.data;
            front = front.next;

            if (front == null) {
                tail = null;
            }

            return data;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }

            return front.data;
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n************");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Exit");
            System.out.println();

            int choice = sc.nextInt();
            int data;

            switch (choice) {
                case 1:
                    System.out.print("Enter data to enqueue: ");
                    data = sc.nextInt();
                    queue.enQueue(data);
                    break;
                case 2:
                    data = queue.deQueue();
                    System.out.println("Dequeued: " + (data == -1 ? "Nothing" : data));
                    break;
                case 3:
                    data = queue.peek();
                    System.out.println("Peek: " + (data == -1 ? "Nothing" : data));
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
