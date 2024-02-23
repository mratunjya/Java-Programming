public class Pallindrome {
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
            printLinkedList();
            return;
        }

        newNode.next = head;
        head = newNode;

        printLinkedList();
    }

    public void printLinkedList() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public Node mid() {
        Node slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public void reverseHalf() {
        Node curr, next, prev;
        curr = mid();
        prev = null;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        printLinkedList();
    }

    public boolean isPalindrome() {
        Node start = head, end = tail;
        boolean flag = true;

        while(start != null && end != null) {
            if(start.data != end.data) {
                flag = false;
                break;
            }

            start = start.next;
            end = end.next;
        }

        return flag;
    }

    public static void main(String[] args) {
        Pallindrome ll = new Pallindrome();

        ll.addStart(1);
        ll.addStart(2);
        ll.addStart(3);
        ll.addStart(2);
        ll.addStart(1);

        ll.reverseHalf();

        System.out.println(ll.isPalindrome());
    }
}
