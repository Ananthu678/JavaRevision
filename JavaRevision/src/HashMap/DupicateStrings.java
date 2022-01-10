package HashMap;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DupicateStrings {
	
	public static void finddup(String[] str) {
		
		/*
		 * HashSet<String> set = new HashSet<String>(Arrays.asList(str));
		 * 
		 * for(String result : set) System.out.println(result);
		 */
		
		Map<String,Integer> map = new LinkedHashMap<String,Integer>();
		
		int count=0;
		
		for(int i=0;i<str.length;i++) {
			  if(map.containsKey(str[i])) {
				  count=map.get(str[i]);
				  map.put(str[i], count+1);
			  }
			  else
				  map.put(str[i], 1);
		}
		
		for(Entry<String,Integer> entry : map.entrySet()) {
			if(entry.getValue()>1)
				System.out.println(entry.getKey() + " ");
		}
		
	}

	public static void main(String[] args) {
		
		String[] str = {"Ananthu", "bala","rio","bala","Ananthu"};
		finddup(str);

	}

}
