package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Duplicate_elements {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,2,2,3,4,5,4,4,7,7,6,5,8,9,10,1,3));
		HashSet<Integer> set = new HashSet<Integer>(numbers);
		
		ArrayList<Integer> numbers1 = new ArrayList<Integer>(set);
		System.out.println(numbers1);
		
		
		//Using stream
		ArrayList<Integer> num = new ArrayList<Integer>(Arrays.asList(1,2,2,2,3,4,5,4,4,7,7,6,5,8,9,10,1,3));
		List<Integer> list1 = num.stream().distinct().collect(Collectors.toList());
		System.out.println(list1);
	}

}
