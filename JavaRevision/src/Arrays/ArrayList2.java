package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList2 {

	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<String>(Arrays.asList("java","python","ruby","c++","selenium","java"));
		System.out.println(a);
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(null);
		num.add(1);
		num.add(2);
		
		System.out.println(num);
		
		System.out.println("------------");
		
		ArrayList<Integer> num1 = new ArrayList<Integer>();
		num1.addAll(num);
		System.out.println(num1);
		
		System.out.println("------------");
		
		System.out.println(num1.size());
		System.out.println(num1.get(1));
		num1.remove(1);
		System.out.println(num1);
		a.remove("java");
		System.out.println(a);
		
		/*
		 * //clear System.out.println("-----------"); num1.clear();
		 * System.out.println(num1);
		 */
		
		
		//clone
		System.out.println("-----------");
		ArrayList<Integer> num2 = (ArrayList<Integer>) num.clone();
		System.out.println(num2);
		
		System.out.println(num2.contains(1));
		System.out.println(num2.indexOf(0)>0);
		System.out.println(a.lastIndexOf("java"));
		
		

	}

}
