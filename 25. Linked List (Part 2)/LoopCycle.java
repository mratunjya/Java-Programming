public class LoopCycle {
    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    Node head, tail;

    public void addStart(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void printLinkedList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public boolean detectCycle() {
        Node slow, fast, prevSlow;
        slow = fast = head;

        while (fast != null && fast.next != null) {
            prevSlow = slow;
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                removeCycle(head, fast, prevSlow);
                return true;
            }
        }

        return false;
    }

    public void removeCycle(Node slow, Node fast, Node prevFast) {
        if (slow == fast) {
            prevFast.next = null;
            return;
        }

        removeCycle(slow.next, fast.next, fast);
    }

    public static void main(String[] args) {
        LoopCycle ll = new LoopCycle();

        ll.addStart(1);
        ll.addStart(2);
        ll.addStart(3);
        ll.addStart(4);
        ll.addStart(5);

        ll.tail.next = ll.head;

        System.out.println("Cycle exist: " + ll.detectCycle());
        ll.printLinkedList();
    }
}
