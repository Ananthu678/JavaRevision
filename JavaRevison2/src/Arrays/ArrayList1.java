package Arrays;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<String>(); 
		
		a.add("Ananthu");
		a.add("learning");
		
		System.out.println(a);
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		
		System.out.println(arr);
		
		/*
		 * Employees e1 =new Employees("Ananthu", 23); Employees e2 =new
		 * Employees("Akila", 25); Employees e3 =new Employees("Keerthana", 21);
		 * 
		 * //Create arrayList
		 * 
		 * ArrayList<Employees> e=new ArrayList<Employees>(); //passing classname
		 * 
		 * e.add(e1); e.add(e2); e.add(e3);
		 */
		
		//iterator
		
		/*Iterator<Employees> it = e.iterator();
		while(it.hasNext()){
			Employees emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.id);
			
		}*/
		
		//addAll;
		 //ar5.addall(ar6)
		//removeAll
		//retainAll (common part)
		
		/*
		 * e.forEach(print -> { System.out.println(print.name);
		 * System.out.println(print.id);
		 * 
		 * });
		 */
		
		
		

	}

}
