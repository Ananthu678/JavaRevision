package practice;

public class searchanelement {

	public static void main(String[] args) {
		
		int a[]= {3,7,9,11,13};
		int x=9;
		boolean flag=false;
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]==x) {
				System.out.println("yes present");
			    flag=true;
			    break;
			}
			    
		}
		if(!flag)
			System.out.println("not present");
	}

}
