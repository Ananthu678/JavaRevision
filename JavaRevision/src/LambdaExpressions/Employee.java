package LambdaExpressions;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Employee {
	
	//return name who's salary>40000 and exp>3
	
	String name;
	int salary;
	int exp;
	
	Employee(String name, int salary, int exp){
		this.name=name;
		this.salary=salary;
		this.exp=exp;
	}
	


	public static void main(String[] args) {
       
		
		  Employee emp = new Employee("John", 40000, 4); System.out.println(emp.name);
		  
		  Predicate<Employee> pr =e-> (e.salary>30000 || e.exp>=4);
		  /*System.out.println(pr.test(emp));
		 */
		
		
		
		ArrayList<Employee> arr = new ArrayList<Employee>();
		arr.add(new Employee("John", 40000, 4));
		arr.add(new Employee("Ananthu", 50000, 3));
		arr.add(new Employee("Rio", 30000, 2));
		arr.add(new Employee("ramya", 20000, 4));
		
		for(Employee e : arr) {
			if(pr.test(e))
				System.out.println(e.name + " " + e.salary);
		}

	}

}
