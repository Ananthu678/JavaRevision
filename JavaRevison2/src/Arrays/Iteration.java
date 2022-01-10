package Arrays;

import java.util.ArrayList;
import java.util.Iterator;

public class Iteration {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(0);
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		
		System.out.println("-------------");
		
		Iterator<Integer> it = arr.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("-------------");
		
		for (Integer integer : arr) {
			System.out.println(integer);
		}
		
		System.out.println("-------------");
		
		arr.stream().forEach(ele -> System.out.println(ele));

	}

}
