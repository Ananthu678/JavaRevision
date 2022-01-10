package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Comparison {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");
		
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		
		map2.put(1, "A");
		map2.put(3, "C");
		map2.put(2, "B");
		
		HashMap<Integer, String> map3 = new HashMap<Integer, String>();
		
		map3.put(1, "B");
		map3.put(2, "B");
		map3.put(3, "C");
		map3.put(4, "D");
		
		//1.using equals method
		System.out.println(map1.equals(map2));
		System.out.println(map2.equals(map3));
		
		//2.using keyset
		System.out.println(map1.keySet().equals(map2.keySet()));
		System.out.println(map2.keySet().equals(map3.keySet()));
		
		//3.find the extra key
		HashSet<Integer> combinekeys = new HashSet<Integer>(map1.keySet());
		combinekeys.addAll(map3.keySet());
		combinekeys.removeAll(map1.keySet());
		
		System.out.println(combinekeys);
		
		//4.map the values

		HashMap<Integer, String> map4 = new HashMap<Integer, String>();
		
		map4.put(1, "A");
		map4.put(2, "B");
		map4.put(3, "C");
		

		HashMap<Integer, String> map5 = new HashMap<Integer, String>();
		
		map5.put(1, "A");
		map5.put(2, "B");
		map5.put(3, "C");
		

		HashMap<Integer, String> map6 = new HashMap<Integer, String>();
		
		map6.put(1, "A");
		map6.put(2, "B");
		map6.put(3, "C");
		map6.put(4, "C");
		
		System.out.println(new ArrayList<>(map4.values()).equals(new ArrayList<>(map5.values())));
		System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map6.values())));
		
		System.out.println(new HashSet<>(map4.values()).equals(new HashSet<>(map5.values())));
		System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map6.values())));
	}

}
