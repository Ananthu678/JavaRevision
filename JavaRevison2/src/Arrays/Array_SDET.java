package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Array_SDET {

	public static void main(String[] args) {
		
		ArrayList a = new ArrayList(Arrays.asList(1,"Ananthu",4,"paru")); 
		ArrayList a1= new ArrayList(Arrays.asList("X", "Y","Z","A","B","C"));
		System.out.println(a);
		System.out.println(a.size());
		
		a.add(2, "bala");
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.get(2));
		a.set(2, "Aari");
		a.add(2, "bala");
		System.out.println(a);
		
		System.out.println(a.contains("Ananthu"));
		a.addAll(a1);
		System.out.println(a);
		
		a.removeAll(a1);
		System.out.println(a);
		ArrayList a2= new ArrayList();
		a2.add(1);
		a2.add(2);
		a2.add("Ananthu");
		a2.add(4);
		
		for(Object e:a2)
		{
			System.out.println(e);
		}
         
		Iterator it=a2.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		ArrayList a3=new ArrayList(a1);
		System.out.println(a3);
		
		Collections.sort(a3);
		System.out.println(a3);
		
		Collections.sort(a3, Collections.reverseOrder());
		System.out.println(a3);
	}

}
