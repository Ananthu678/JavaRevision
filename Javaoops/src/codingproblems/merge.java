package codingproblems;

import java.util.HashMap;
import java.util.Map;

public class merge {
	
	public void mergenumbers(int a[], int b[]) {
		
		Map<Integer,Boolean> mp = new HashMap<Integer,Boolean>();
		
		for (int i = 0; i < a.length; i++) {
			mp.put(a[i], true);
		}
		
		for (int i = 0; i < b.length; i++) {
			mp.put(b[i], true);
		}
		
		for(Map.Entry<Integer,Boolean> entry : mp.entrySet()) {
			System.out.println(entry.getKey());
		}
	}

	public static void main(String[] args) {

       int a[]= {1,7,5,9}, b[]= {2,7,6,9};
       merge obj=new merge();
       obj.mergenumbers(a,b);
      

	}

}
