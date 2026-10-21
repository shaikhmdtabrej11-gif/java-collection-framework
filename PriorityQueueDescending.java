
import java.util.*;

public class PriorityQueueDescending {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq =
            new PriorityQueue<>(Collections.reverseOrder());

        pq.offer(10);
        pq.offer(40);
        pq.offer(20);
        pq.offer(30);

        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
    }
}
