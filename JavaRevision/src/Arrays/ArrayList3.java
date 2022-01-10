package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList3 {

	public static void main(String[] args) {
		
		//print even numbers
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		numbers.removeIf(num -> num%2 !=0);
		System.out.println(numbers);
		
		ArrayList<String> a = new ArrayList<String>(Arrays.asList("java","python","ruby","c++","selenium","java"));
		a.retainAll(Collections.singleton("java"));
		System.out.println(a);
		
		ArrayList<Integer> numbers1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        //ArrayList<Integer> numbersnew = (ArrayList<Integer>) numbers1.subList(2, 6);
        
		ArrayList<Integer> numbersnew = new ArrayList<Integer>(numbers1.subList(2, 6));
        System.out.println(numbersnew);
        
        ArrayList<String> a1 = new ArrayList<String>(Arrays.asList("java","python","ruby","c++","selenium","java"));
        
        Object arr[] = a1.toArray();
        System.out.println(Arrays.toString(arr));
	}

}
