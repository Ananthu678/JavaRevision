package codingproblems;

import java.util.HashSet;
import java.util.Set;

public class Matrix {
	
	public static void modifymatrix(int matrix[][], int R, int C) {
		
		Set<Integer> rows = new HashSet<Integer>();
		Set<Integer> cols = new HashSet<Integer>();
		
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				if(matrix[i][j]==1) {
					rows.add(i);
				    cols.add(j);
				}
			}
		}
		
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				if(rows.contains(i) || cols.contains(j)) {
					 matrix[i][j]=1;
				}
			}
		}
	}
	
	public static void printmatrix(int matrix[][], int R, int C) {
		
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				System.out.print(" " + matrix[i][j]);
			}
			
			System.out.println();
		}
	}

	public static void main(String[] args) {


		int matrix[][]= { {1, 0, 2, 1},
                          {3, 4, 5, 2},
                          {0, 3, 0, 5},};
		
		System.out.println("before modifying the matrix");
		printmatrix(matrix, matrix.length, matrix[0].length);
		modifymatrix(matrix, matrix.length, matrix[0].length);
		System.out.println("After modifying the matrix");
		printmatrix(matrix, matrix.length, matrix[0].length);
		

	}

}
