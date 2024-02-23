public class ZigZagLinkedList {
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

    public void print() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public Node getMid() {
        Node slow, fast;
        slow = fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public void reverseSecondHalf() {
        Node next = null, prev = null, curr = getMid();

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
    }

    public void zigZag() {
        reverseSecondHalf();

        Node temp1 = head, temp2 = tail;
        Node newLL = new Node(-1);
        Node temp3 = newLL;

        while(temp2 != null) {
            if(temp1 == temp2) {
                temp3.next = temp1;
                temp3.next.next = null;
                break;
            }

            temp3.next = temp1;
            temp1 = temp1.next;
            temp3.next.next = temp2;
            temp2 = temp2.next;
            temp3 = temp3.next.next;
        }
    }

    public static void main(String[] args) {
        ZigZagLinkedList ll = new ZigZagLinkedList();

        ll.addStart(5);
        ll.addStart(4);
        ll.addStart(3);
        ll.addStart(2);
        ll.addStart(1);

        ll.print();

        ll.zigZag();

        ll.print();
    }
}
