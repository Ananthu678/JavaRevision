package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Array_different {
	
	public static String duplicateremove(String s) {
		
		
		Set<Character> set = new HashSet<Character>();
		
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
		}
		
		for (char ch : set)
		System.out.print(ch);
		
		return s;
		
		
		
	}

	public static void main(String[] args) {
		
		String str = "bbbcsdsd";
		String result = duplicateremove(str);
		
		
		
}
}
