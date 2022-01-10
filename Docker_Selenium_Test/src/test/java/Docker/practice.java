package Docker;

import org.testng.annotations.Test;

public class practice {
	
	static int a=10;
	
	@Test
	public void display() {
		System.out.println("checking");
		a=15;
		System.out.println(a);
	}
	
	

}
