package codingproblems;

import java.util.PriorityQueue;

public class priorityQueue {
	
	public static int kthlargest(int nums[], int k) {
		
		PriorityQueue minheap = new PriorityQueue();
		
		for(int i : nums) {
			minheap.add(i);
			if(minheap.size() > k) {
				minheap.remove();
			}
		}
		return (int) minheap.remove();
	}
	
	public static void addelements(int nums[], int k) {
		
		PriorityQueue minheap1 = new PriorityQueue();
		for(int i : nums) {
			minheap1.add(i);
		}
		System.out.println(minheap1);
	}

	public static void main(String[] args) {
		
		
		int nums[]= {};
		int k=2;
		int a = kthlargest(nums,k);
		
		System.out.println(a);
		
		addelements(nums, k);

	}

}
