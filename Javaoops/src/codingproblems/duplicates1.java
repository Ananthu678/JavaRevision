package codingproblems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class duplicates1 {

	public static void printwithoutduplicates(int a[]) {
		
	 ArrayList<Integer> alist = new ArrayList<Integer>();
	 
		
	 for (int i = 0; i < a.length; i++) { alist.add(a[i]); }
		 
	 
	
	  Set<Integer> set = new HashSet<Integer>(alist);
	  
	  for(int result : set)
		  System.out.println(result);
		  
       
	}
	public static void main(String[] args) {
		 int a[]={1,1,2,2};
		 printwithoutduplicates(a);

	}

}
