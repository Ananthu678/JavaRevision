package HashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class duplicateelements {
	
	public static void printarr(int[] arr, int n) {
		
		Map<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
		
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			
			if(map.containsKey(arr[i])) {
				count = map.get(arr[i]);
				map.put(arr[i], count+1);
			}
			
			else
				map.put(arr[i], 1);
		}
		
		for(Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey() + " ");
			}
		}
	}

	public static void main(String[] args) {
		
		int arr[]= {12,11,40,34,12,24,40,11};
		int n = arr.length;
		printarr(arr,n);
	}

}
