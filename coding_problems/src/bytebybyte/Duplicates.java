package bytebybyte;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Duplicates {

	public static void duplicates(int arr[]) {

		Map<Integer, Integer> dp = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {

			int count = 0;
			if (dp.containsKey(arr[i])) {
				count = dp.get(arr[i]);
				dp.put(arr[i], count + 1);
			}

			else
				dp.put(arr[i], 1);
		}

		for (Entry<Integer, Integer> dupelements : dp.entrySet()) {
			if (dupelements.getValue() == 1) {
				System.out.println("the duplicate elements are " + " " + dupelements.getKey());
				;
			}
		}
	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 1, 4, 2, 5, 5 };
		duplicates(arr);

	}

}
