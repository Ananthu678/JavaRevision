package LinkedList;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		
		LinkedList lst =new LinkedList(Arrays.asList("X","Y","Z","A","B","C"));
		System.out.println(lst);
		
		System.out.println(lst.size());
		
		lst.add(3, "K");
		System.out.println(lst);
		
		System.out.println("before sorting : " + lst);
		Collections.sort(lst);
		System.out.println("After sorting : "+ lst);
		
		Collections.sort(lst, Collections.reverseOrder());
		System.out.println(lst);
		
		Collections.shuffle(lst);
		System.out.println(lst);
		
		LinkedList lst1=new LinkedList();
		lst1.add("tiger");
		lst1.add("Lion");
		lst1.add("kangaroo");
		
		System.out.println(lst1);
		lst1.addFirst(1);
		lst1.addLast(2);
		
		System.out.println(lst1);

		LinkedList lst2 =new LinkedList(Arrays.asList("X",100,"Y","Z",200));
		System.out.println(lst2);
		
		System.out.println(lst2.poll());
		System.out.println(lst2);
		
		
	}

}
