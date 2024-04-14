package priorityqueue;

import java.util.*;

public class SortingPriorityQueue {
	public static void main (String [] args) {
		Integer [] integerArr = {3, 4, 2, 1, 7, 9, 10};
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
		
		for (Integer element : integerArr) {
			pQueue.add(element);
		}
		
		for (int i = 0; i < integerArr.length; i++) {
			integerArr[i] = pQueue.remove();
			System.out.println(integerArr[i]);
		}
	}
}
