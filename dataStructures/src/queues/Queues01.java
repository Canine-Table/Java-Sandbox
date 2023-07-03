package queues;
import java.util.Queue;
import java.util.LinkedList;

public class Queues01 {

	public static void main(String[] args) {
		/**
		 * Queues = FIFO data structure. First-In First-Out
		 * A collection designed for holding elements prior to processing
		 * Linear data structure
		 * add = enqueue, offer()
		 * remove = dequeue, pull()
		 */

		Queue<String> queue = new LinkedList<String>();

		queue.offer("gnu");
		queue.offer("gila ");
		queue.offer("monster");
		queue.offer("lemur");
		queue.offer("duckbill ");
		queue.offer("platypus");
		queue.offer("guanaco");
		queue.offer("dugong");

		System.out.println("\n\n\ncontains guanaco: "+queue.contains("guanaco")+"\n");
		while(!queue.isEmpty()) {
			System.out.println("Top most animal is: "+queue.peek());
			System.out.println("current list contains: "+queue);
			System.out.println("the size of this list is now: "+queue.size()+"\n");
			queue.poll();
		}
	}
	/**
	 * Where are queues useful?
	 *
	 * 1.) Keyboard Buffer (letter should appear on the screen in the order they're pressed)
	 * 2.) Print Buffer (print jobss should be completed in order
	 * 3.) Used in LinkLists, PriorityQueue,Breath-first search
	 */
}
