package HashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateString {
	
	public static void printdup(String str) {
		
		 char[] ch = str.toCharArray();
		 Map<Character, Integer> map = new LinkedHashMap<Character,Integer>();
		 
		 int count=0;
		 for (int i = 0; i < ch.length; i++) {
			  if(map.containsKey(ch[i])) {
				  count=map.get(ch[i]);
				  map.put(ch[i], count+1);
			  }
			  
			  else
				  map.put(ch[i], 1);
		}
		 
		for(Entry<Character,Integer> entry : map.entrySet()) {
			if(entry.getValue()>1)
				System.out.println(entry.getKey() + " ");
		}
	}
	
	

	public static void main(String[] args) {

       String str="Ananthha";
       printdup(str);

	}

}
