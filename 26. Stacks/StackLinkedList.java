public class StackLinkedList {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public boolean isEmpty() {
        return head == null;
    }

    public void push(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return;
        }

        head = head.next;
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.println(head.data);
    }

    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();

        stack.peek();
        stack.push(1);
        stack.peek();
        stack.push(2);
        stack.peek();
        stack.push(3);
        stack.peek();

        stack.peek();
        stack.pop();
        stack.peek();
        stack.pop();
        stack.peek();
        stack.pop();
        stack.peek();
        stack.pop();
        stack.peek();
    }
}
