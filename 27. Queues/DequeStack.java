import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class DequeStack {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("************");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Exit");
            System.out.println();

            int choice = sc.nextInt();
            int data;

            switch (choice) {
                case 1:
                    System.out.print("Enter data to push: ");
                    data = sc.nextInt();
                    deque.addLast(data);
                    break;
                case 2:
                    data = deque.size() > 0 ? deque.removeLast() : -1;
                    System.out.println("Popped: " + data);
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
