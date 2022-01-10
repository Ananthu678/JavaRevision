package practice;

import java.util.ArrayList;

public class ArrayListD {
	
	
	

	public static void main(String[] args) {
	
		ArrayList arr1 = new ArrayList();
		arr1.add(1);
		arr1.add(2);
		arr1.add(3);
		arr1.add(4);
		arr1.add(5);
		arr1.add(6);
		arr1.add(7);
		arr1.add(8);
		arr1.add(9);
		arr1.add(10);
		arr1.add(11);
		arr1.add(12);
		arr1.add(13);
		arr1.add(14);
		arr1.add(15);
		arr1.add(16);
		arr1.add(17);
		arr1.add(18);
		arr1.add(19);
		arr1.add(20);
		arr1.add(21);
		arr1.add(22);
		arr1.add(23);
		arr1.add(24);
		arr1.add(25);
		arr1.add(26);
		arr1.add(27);
		arr1.add(28);
		
		
		
		System.out.println(arr1);
		
		int a[] = new int[5];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		
		
		  for (int i = 0; i < a.length; i++) { 
			  System.out.print(" " + a[i]); 
			  }
		 
		
		
		int a1[] = {1,2,3,4,5};
		int a2[] = {2,3,1,4,5}; //two arrays are equal
		
		for (int i = 0; i < a1.length; i++) {
			for (int j = 0; j < a2.length; j++) {
				if(a1[i]==a2[j]) {
					break;
				}
			}
			
		}
		
		
		
		
		
	}

	 
}
