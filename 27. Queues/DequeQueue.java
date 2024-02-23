import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class DequeQueue {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();

        Scanner sc = new Scanner(System.in);

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
                    deque.addLast(data);
                    break;
                case 2:
                    data = deque.size() > 0 ? deque.removeFirst() : -1;
                    System.out.println("Dequed: " + data);
                    break;
                case 3:
                    data = deque.peekLast();
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
