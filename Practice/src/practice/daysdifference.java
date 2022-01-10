package practice;

import java.util.ArrayList;
import java.util.List;

public class daysdifference {
	
	static List<Integer> difference = new ArrayList();
	
	public static List<Integer> difference(int[] temp){
		
		for (int i = 0; i <temp.length; i++) {
			  int next=temp[i], count=0;
			  
			  for (int  j = i+1;  j <temp.length;  j++) {
				  count++;
				  if(temp[i]<temp[j]) {
					  difference.add(count);
					  break;
				  }
					  
			}
		}
		return difference;
		
	}
	
	public static void printarray(List<Integer> difference) {
		
		for (int result : difference) {
			System.out.println(result);
		}
	}

	public static void main(String[] args) {
		
		int temp[]= {30,40,50,60};
		difference(temp);
		
		printarray(difference);
		
		
		
		

	}

}
