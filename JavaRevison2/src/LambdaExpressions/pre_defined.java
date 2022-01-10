package LambdaExpressions;

import java.util.function.Predicate;

//Predicate - one parameter; boolean; conditional checks

public class pre_defined {

	public static void main(String[] args) {
		
		//Ex1
		Predicate<Integer> pt =i->(i>10);
		System.out.println(pt.test(20));//true
		
		//Ex2 length of the given string is greater than 4 or not
		Predicate<String> pt1=s->(s.length()>5);
		System.out.println(pt1.test("Ananthu"));//false
		
		//Ex3: print array elements whose size is greater than 4
		String str[] = {"Ananthu","Bala","Aari","Rio"};
		for(String name : str) {
			if(pt1.test(name))
				System.out.println(name);
		}

	}

}
