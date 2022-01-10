package practice;

import java.util.ArrayList;
import java.util.List;

public class allanagrams {
	
	public static List<Integer> findanagrams(String s, String p, List<Integer> result){
		
		List<Integer> result1 =new ArrayList();
		
		if(s.length()==0 || s==null) return result1;
		
		int[] char_count = new int[26];
		for(char c : p.toCharArray()) {
			char_count[c -'a']++;
		}
		
		int left=0;
		int right=0;
		int count=p.length();
		
		while(right<s.length()) {
			if(char_count[s.charAt(right++) - 'a']-- >=1)count--;
			
			if(count==0) result1.add(left);
			
			if(right-left == p.length() && char_count[s.charAt(left++) - 'a']++ >=0) count++;
		}
		
		return result1 ;
		
	}

	public static void main(String[] args) {
		
		String s="bacbacbacd";
		String p="abc";
		
		List<Integer> result = new ArrayList();
		
		result= findanagrams(s, p, result);
		
		for(int a : result)
			System.out.println(a);
		
	}

}
