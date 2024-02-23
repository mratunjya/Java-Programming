import java.util.Queue;
import java.util.LinkedList;

public class InterleavedQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= 10; i++) {
            queue.add(i);
        }

        System.out.println(queue);

        Queue<Integer> tempQueue = new LinkedList<>();

        int count = 0;
        int size = queue.size();

        while (count != size / 2) {
            ++count;
            tempQueue.add(queue.remove());
        }

        while(!tempQueue.isEmpty()) {
            queue.add(tempQueue.remove());
            queue.add(queue.remove());
        }

        System.out.println(queue);
    }
}
