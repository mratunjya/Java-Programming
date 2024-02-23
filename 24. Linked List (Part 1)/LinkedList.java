public class LinkedList {
    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size = 0;

    public void addBeginning(int data) {
        Node n = new Node(data);
        ++size;

        if (head == null) {
            head = tail = n;
            return;
        }

        n.next = head;
        head = n;
    }

    public void addEnd(int data) {
        Node n = new Node(data);
        ++size;

        if (head == null) {
            head = tail = n;
            return;
        }

        tail.next = n;
        tail = n;
    }

    public void insertMiddle(int data, int i) {
        if (i == 0) {
            addBeginning(data);
            return;
        }

        Node n = new Node(data);
        Node prev = null, next = null;

        Node temp = head;

        while (temp != null && i >= 0) {
            i--;
            if (i == -1)
                next = temp;

            if (i == 0)
                prev = temp;

            temp = temp.next;
        }

        if (prev == null && next == null) {
            return;
        } else if (prev == null) {
            n.next = head;
            head = n;
        } else if (next == null) {
            tail.next = n;
            tail = n;
        } else {
            prev.next = n;
            n.next = next;
        }

        ++size;
    }

    public int deleteBeginning() {
        if (size == 0) {
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int data = head.data;
            head = tail = null;
            size = 0;
            return data;
        }

        int data = head.data;
        head = head.next;
        --size;
        return data;
    }

    public int deleteEnd() {
        if (size == 0) {
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int data = head.data;
            head = tail = null;
            size = 0;
            return data;
        }

        Node prev = head;

        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int data = prev.next.data;
        prev.next = null;
        tail = prev;
        --size;
        return data;
    }

    public Node reverseLinkedList(Node curr, Node prev) {
        if (curr.next == null) {
            curr.next = prev;
            head = curr;
            return prev;
        }

        Node temp = reverseLinkedList(curr.next, curr);
        temp.next = prev;
        curr = temp;

        if(prev == null) {
            tail = curr;
        }

        return prev;
    }

    public void printNode(Node temp) {
        if (temp == null)
            return;

        System.out.print(temp.data + " -> ");
        printNode(temp.next);
    }

    public void printLinkedList() {
        Node temp = head;

        printNode(temp);
        System.out.println("null");
        System.out.println("Total Size: " + size);
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addBeginning(0);
        ll.printLinkedList();
        ll.addBeginning(1);
        ll.printLinkedList();
        ll.addEnd(2);
        ll.printLinkedList();

        ll.addBeginning(3);
        ll.addBeginning(4);
        ll.addEnd(5);
        ll.printLinkedList();

        ll.insertMiddle(100, 4);
        ll.printLinkedList();

        System.out.println("Deleted: " + ll.deleteEnd());
        ll.printLinkedList();

        System.out.println("Deleted: " + ll.deleteEnd());
        ll.printLinkedList();

        System.out.println("Deleted: " + ll.deleteBeginning());
        ll.printLinkedList();

        ll.reverseLinkedList(head, null);
        ll.printLinkedList();
    }
}
