package HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


public class Hashmapbasics {

	public static void main(String[] args) {
		
		int count=0;
		HashMap<String, String> capitalmap = new HashMap<String, String>();
		capitalmap.put("India", "delhi");
		capitalmap.put("India", "pak");
		capitalmap.put("USA", "Washi");
		capitalmap.put("UK", "London");
		capitalmap.put("Singa", "Dontknow");
		capitalmap.put("Malaysian", "Malay");
		capitalmap.put(null, "Berlin");
		capitalmap.put("Russia", null );
		
		System.out.println(capitalmap.get("USA"));
		System.out.println(capitalmap.get(null));
		System.out.println(capitalmap.get("Russia"));
		System.out.println(capitalmap.get("India"));
		
		Map<Character, Integer> capitalmap1 = new LinkedHashMap<Character, Integer>();
		
		capitalmap1.put('A',2);
		capitalmap1.put('U', 2);
		capitalmap1.put('g', 1);
		
		count=capitalmap1.get('A');
		System.out.println(count);
		
		System.out.println(capitalmap1.size());
		
		
		

	}

}
