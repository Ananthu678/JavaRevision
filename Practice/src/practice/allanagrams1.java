package practice;

import java.util.ArrayList;
import java.util.List;

public class allanagrams1 {
	
	public static List<Integer> findanagrams(String s, String p, List<Integer> result){
		
		List<Integer> rst = new ArrayList<>();
        if (s == null || s.length() == 0 || s.length() < p.length()) {
            return rst;
        }

        int[] map_p = new int[26];
        int[] map_s = new int[26];
        // Initialize the map / window
        for (int i = 0; i < p.length(); i++) {
            map_p[p.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < p.length(); i++) {
            map_s[s.charAt(i) - 'a']++;
        }
        

        for (int i = 0; i < s.length() - p.length(); i++) {
            if (isMatch(map_p, map_s)) {
                rst.add(i);
            }
            // if don't match, we move the sliding window
            // remove the preceding character and add a new succeeding character to the new window
            map_s[s.charAt(i+p.length()) - 'a']++;
            map_s[s.charAt(i) - 'a']--;
            
        }
        
        if (isMatch(map_p, map_s)) {
            rst.add(s.length() - p.length());
        }
        return rst;
    }

    public static boolean isMatch(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

	

	public static void main(String[] args) {
	
		String s="cbdcbdcabc";
		String p="abc";
		
		List<Integer> result = new ArrayList();
		
		result= findanagrams(s, p, result);
		
		for(int a : result)
			System.out.println(a);
	}

	}
