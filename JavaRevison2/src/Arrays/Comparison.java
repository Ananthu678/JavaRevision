package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class Comparison {

	public static void main(String[] args) {
		
		ArrayList<String> name = new ArrayList<String>(Arrays.asList("A", "B", "D","C","E"));
		
		ArrayList<String> name1 = new ArrayList<String>(Arrays.asList("A", "B", "C","D","F"));

	    Collections.sort(name);
		Collections.sort(name1);
		
		System.out.println(name.equals(name1));
		
		ArrayList<String> name2 = new ArrayList<String>(Arrays.asList("A", "B", "C","D","F"));
		
		System.out.println(name1.equals(name2));
		
		//to eliminate the common elements
		ArrayList<String> name4 = new ArrayList<String>(Arrays.asList("A", "B", "C","D","F"));
		ArrayList<String> name5 = new ArrayList<String>(Arrays.asList("A", "B", "C","D","E"));
		
		name4.removeAll(name5);
		System.out.println(name4);
		
		name5.removeAll(name4);
		System.out.println(name5);
		
		ArrayList<String> name6 = new ArrayList<String>(Arrays.asList("A", "B", "C","D","F"));
		ArrayList<String> name7 = new ArrayList<String>(Arrays.asList("A", "B", "C","D","E"));
		
		//to find the common elements
		name6.retainAll(name7);
		System.out.println(name6);
		
		ArrayList<String> name8 = new ArrayList<String>(Arrays.asList("A", "B", "C","D","F"));
		ArrayList<String> name9 = new ArrayList<String>(Arrays.asList("A", "B", "C","D","E"));
		
		HashSet<String> combine = new HashSet<String>(name8);
		combine.addAll(name9);
		System.out.println(combine);
		
		
	}

}
