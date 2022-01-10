package LambdaExpressions;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class Functions {

	public static void main(String[] args) {

		Employee emp = new Employee("David", 20000, 4);

		ArrayList<Employee> arr = new ArrayList<Employee>();
		arr.add(new Employee("David", 25000, 4));
		arr.add(new Employee("Ananthu", 30000, 5));
		arr.add(new Employee("Ram", 40000, 4));
		arr.add(new Employee("Ramya", 50000, 4));

		/*
		 * for(Employee e:arr) System.out.println(e.name + " " + e.salary + " "+ e.exp);
		 */

		Function<Employee, Integer> fun = e -> {

			int sal = e.salary;
			if (sal >= 20000 && sal <= 3000)
				return sal * 20 / 100;
			else if (sal >= 30000 && sal <= 40000)
				return sal * 15 / 100;
			else
				return sal * 10 / 100;
		};
		
		Predicate<Integer> pr = b -> (b >= 5000);
		for (Employee e : arr) {

			int bonus = fun.apply(e);
			if (pr.test(bonus))
				System.out.println(e.name + "  " + e.salary + " " + bonus);

		}
		
		 //andThen
		 Function<Integer, Integer> fun1 =n->n*2;
		 Function<Integer,Integer> fun2 =n-> n*n*n;
		 
		 System.out.println(fun1.andThen(fun2).apply(2)); //64
		 System.out.println(fun1.compose(fun2).apply(2)); //16
		 
		
		

	}

}
