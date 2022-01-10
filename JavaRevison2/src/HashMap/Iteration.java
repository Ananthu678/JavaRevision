package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Iteration {

	public static void main(String[] args) {
		
		HashMap<String, String> capitalmap = new HashMap<String, String>();
		capitalmap.put("India", "Delhi");
		capitalmap.put("USA", "Washi");
		capitalmap.put("UK", "London");
		capitalmap.put("Singa", "Dontknow");
		capitalmap.put("Malaysian", "Malay");
		capitalmap.put(null, "Berlin");
		capitalmap.put("Russia", null );
		
		//using keyset
		Iterator<String> it = capitalmap.keySet().iterator();
		while(it.hasNext()) {
          String key = it.next();
          String value=capitalmap.get(key);
          System.out.println("key is "  + key + "value is " +value );
	
		}
		
		System.out.println("-------------");
		
		//using pair set
		Iterator<Entry<String, String>> it1=capitalmap.entrySet().iterator();
		while(it1.hasNext()) {
			Entry<String, String> entry=it1.next();
			System.out.println("key is" + entry.getKey() + "value is" + entry.getValue());
		}
		
		System.out.println("-------------");
		
		//Using lambda
		capitalmap.forEach((k,v)-> System.out.println("key " + k + "and value" + v));
}
}
