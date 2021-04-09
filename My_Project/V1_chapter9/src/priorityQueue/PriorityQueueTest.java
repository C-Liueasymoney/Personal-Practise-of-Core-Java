package priorityQueue;

import java.time.LocalDate;
import java.util.PriorityQueue;

public class PriorityQueueTest {
    public static void main(String[] args) {
        var pq = new PriorityQueue<LocalDate>();
        pq.add(LocalDate.of(1996, 12, 3));
        pq.add(LocalDate.of(1874, 11, 23));
        pq.add(LocalDate.of(1998, 6, 1));

        System.out.println(pq);

        for (LocalDate date : pq)
            System.out.println(date);
        while (!pq.isEmpty())
            System.out.println(pq.remove());
        System.out.println(pq);
    }
}
