import java.util.LinkedList;
import java.util.Queue;

public class LearnedLinkedList {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();

        queue.offer(12);
        queue.offer(24);
        queue.offer(25);
        queue.offer(27);
        System.out.println("Printing the value of the queue :"+queue);

        System.out.println("Returning the poll value :"+queue.poll());
        System.out.println("Printing the queue value :"+queue);

        System.out.println("Returning the second value which is going to be pop next() :"+queue.peek());
    }
}
