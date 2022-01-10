package Queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class queue {

	public static void main(String[] args) {
		
		PriorityQueue q=new PriorityQueue();
		
		 q.add("A");
		 q.add("B");
		 q.add("C"); 
		 q.offer("C");
		 
		
		//insertion order is preserved
		//duplicates are allowed
		System.out.println(q);
		
		System.out.println(q.element());
		System.out.println(q.peek());
		
		//System.out.println(q.remove());
		System.out.println(q);
		
		//System.out.println(q.poll());
		System.out.println(q);
		
         Iterator it= q.iterator();
         while(it.hasNext())
        	 System.out.print(it.next());
	}

}
