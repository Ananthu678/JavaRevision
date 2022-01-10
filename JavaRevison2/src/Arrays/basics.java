package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class basics {
	
	public static int[] removeduplicates(int[] arr) {
		
		//Arrays.sort(arr);
		
		/*
		 * int[] result=new int[arr.length]; int previous =arr[0]; result[0]= previous;
		 * for (int i = 1; i < arr.length; i++) { int ch =arr[i]; if(previous != ch) {
		 * result[i]=ch; } previous=ch; } return result;
		 */
		
		Arrays.sort(arr);
		int[] result=new int[arr.length];
		
		 int j=0;
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]!=arr[i+1]) {
				result[j]=arr[i];
				j++;
			}
		}
		result[j]=arr[arr.length-1];
		return result;
	    	
	}
	
	public static void findduplicates(int[] arr) {

		boolean ifpresent = false;
		ArrayList al = new ArrayList();

		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					if (al.contains(arr[i]))
						break;
					else
						al.add(arr[i]);
					ifpresent = true;
				}
			}
		}

	   if(ifpresent==true)
	     System.out.print(" " + al + " ");
	   else
	    	 System.out.println("no duplicates");
	}

	public static void main(String[] args) {
 
		 int [][] test = new int [][] {
			 {1,1,2,2,3,4,5,1},
			 {1,2,3,4,5,6,7}
		 };
		 
		 basics basic = new basics();
		 
		 for (int[] input : test) {
			System.out.println("Array with duplicates"+ Arrays.toString(input));
			System.out.println(Arrays.toString(removeduplicates(input)));
			
			findduplicates(input);
		 }

	}

}
