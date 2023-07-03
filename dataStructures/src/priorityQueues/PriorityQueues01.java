package priorityQueues;
import java.util.Queue;
import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueues01 {

	public static void main(String[] args) {
		/**
		 * Priority Queue = A FIFO data structure that serves elements
		 * with the highest priorities fiirst
		 * before elements with lower priority
		 */

		Queue<Double> pQueue = new PriorityQueue<Double>(Collections.reverseOrder());
		double[] gpaNumber = {4.0,2.5,2.5,2.1,3.7,2.6,3.5,3.9,3.8,3.4};

		for(int i = 0; i < gpaNumber.length; i++)	{
			pQueue.offer(gpaNumber[i]);
		}
		while(!pQueue.isEmpty()){
			System.out.println(pQueue.poll());
		}

	}

}
