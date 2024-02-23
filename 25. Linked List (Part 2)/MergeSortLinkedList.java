public class MergeSortLinkedList {
    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head, tail;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void printLinkedList(Node curr) {
        if (curr == null)
            return;
        System.out.print(curr.data + " -> ");
        printLinkedList(curr.next);
    }

    public Node getMid(Node head) {
        Node slow, fast;
        slow = head;
        fast = head.next;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }

    public Node mergeSort(Node head) {
        if(head.next == null) {
            return head;
        }

        Node mid = getMid(head);
        Node head2 = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(head2);

        return merge(newLeft, newRight);
    }

    public Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
 
        while(head1 != null && head2 != null) {
            if(head1.data > head2.data) {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            } else {
                temp.next = head1;
                 head1 = head1.next;
                 temp = temp.next;
            }
        }

        while(head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while(head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        
        return mergedLL.next;
    }

    public static void main(String[] args) {
        MergeSortLinkedList ll = new MergeSortLinkedList();

        ll.addFirst(8);
        // ll.addFirst(10);
        // ll.addFirst(7);
        // ll.addFirst(12);
        // ll.addFirst(15);

        ll.printLinkedList(ll.head);
        System.out.println("null");

        ll.printLinkedList(ll.mergeSort(ll.head));
        System.out.println("null");
    }
}
