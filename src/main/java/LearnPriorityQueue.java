import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> priorityq = new PriorityQueue<>();
        priorityq.offer(12);
        priorityq.offer(13);
        priorityq.offer(14);
        priorityq.offer(15);
        priorityq.offer(2);

        System.out.println("The priority queue is :"+priorityq);
        System.out.println("The first element to be removed is :"+priorityq.poll());
        System.out.println("The second element which will be poped out the Priority Queue will be :"+priorityq.peek());
        System.out.println("Checking whether the second element is removed or not, the list is  :"+priorityq);


        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.addAll(priorityq);
        System.out.println("Added the priorityq into the priority into the pq :"+pq);
        System.out.println("The first element of the New Priority Queue is :"+pq.peek());



    }
}
