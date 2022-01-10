package bytebybyte;

import java.util.HashSet;
import java.util.Set;

public class booleanmatrix {

	public static void truematrix(boolean arr[][], int r, int c) {

		// int r=arr.length, c=arr[0].length;

		Set<Integer> rows = new HashSet<Integer>();
		Set<Integer> cols = new HashSet<Integer>();

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (arr[i][j] == true) {
					rows.add(i);
					cols.add(j);
				}
			}
		}

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (rows.contains(i) || cols.contains(j))
					arr[i][j] = true;
			}
		}
	}

	public static void printmatrix(boolean arr[][], int r, int c) {
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(" " + arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		boolean arr[][] = { { true, false, false }, { false, false, false }, { true, true, false } };
		int r = arr.length, c = arr[0].length;

		System.out.println("-----------------------");
		printmatrix(arr, r, c);

		truematrix(arr, r, c);

		System.out.println("-----------------------");
		printmatrix(arr, r, c);

	}

}
