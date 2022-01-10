package bytebybyte;

import java.util.HashSet;
import java.util.Set;

public class medianarray {

	public static void median(int[] arr1, int[] arr2) {

		int n = arr1.length, n1 = arr1.length, sum = 0;

		Set<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < n; i++) {
			set.add(arr1[i]);
		}

		for (int i = 0; i < n1; i++) {
			set.add(arr2[i]);
		}

		int m = set.size();

		for (Integer result : set) {
			sum += result;
		}

		int result1 = sum / m;
		System.out.println(result1);
	}

	public static void main(String[] args) {

		int arr1[] = { 1, 2, 5 };
		int[] arr2 = { 6,7,8 };

		median(arr1, arr2);

	}
}
