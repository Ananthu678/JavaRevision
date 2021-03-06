package codingproblems;

import java.util.Collections;
import java.util.PriorityQueue;

public class kthsmallest {

	public static int kthSmallestElementInGivenArrayMaxHeap(int[] arr, int k) {
	    if(arr.length < k) {
	      System.out.println("Invalid Case");
	      return -1;
	    }
	    
	    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
	    
	    for(int i = 0; i < k; i++) {
	      maxHeap.add(arr[i]);
	    }
	    
	    for(int i = k; i < arr.length; i++) {
	      if(arr[i] < maxHeap.peek()) {
	        maxHeap.poll();
	        maxHeap.add(arr[i]);
	      }  
	    }
	    
	    return maxHeap.peek();
	  }
	
	public static void main(String[] args) {
	    
	    int[] arr = {10, 7, 11, 30, 20, 38, 2, 45};
	    int k = 3;
	    
	    System.out.println(kthSmallestElementInGivenArrayMaxHeap(arr, k));
	    
	    
	  }
}
	  
