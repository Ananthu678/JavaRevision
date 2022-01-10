package LambdaExpressions;

import java.util.ArrayList;
import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class demo_last {

	public static void main(String[] args) {
		
		Employee emp =new Employee("Aari", 50000, 4);
		
		ArrayList<Employee> list1=new ArrayList<Employee>();
		list1.add(new Employee("Aari", 50000, 4));
		list1.add(new Employee("Rio", 60000, 3));
		list1.add(new Employee("Ananthu", 70000, 4));
		list1.add(new Employee("Ramya", 80000, 4));
		
		Function<Employee, Integer> fn=e->
		                        {
		                        	int sal=e.salary;
		                        	if(sal>=50000 && sal<=70000)
		                            return sal+=sal*10/100;
		                        	else if(sal>70000 && sal<=90000)
									return sal+=sal*5/100;
		                        	else
		                        	 return sal+=sal*2/100;
		                        	
		                        };
		                        Function<Employee, Integer> fun = e -> {

		                			int sal = e.salary;
		                			if (sal >= 20000 && sal <= 30000)
		                				return sal * 20 / 100;
		                			else if (sal >= 30000 && sal <= 70000)
		                				return sal * 10/ 100;
		                			else
		                				return sal * 5 / 100;
		                		};
		                        
		 Predicate<Integer> salary=s->(s>=75000);
		 Predicate<Integer> salary1=s->(s>=5000);
		 
		 Consumer<Employee> emp1=e->
		 {
			 System.out.println(e.name);
			 System.out.println(e.salary);
			 System.out.println(e.exp);
		 };
		 
		 for(Employee e:list1) {
			 
			 int new_salary=fn.apply(e);
			 int bonus=fun.apply(e);
			 
			 if(salary.test(new_salary) && salary1.test(bonus)) {
				    emp1.accept(e);
				    System.out.println("their new salary is :" + new_salary );
				    System.out.println("their bonus is :" + bonus );
			 }
		 }
		 
		 Supplier<Date> date =()->new Date();
		 System.out.println(date.get());
		
		 
		

	}

}
