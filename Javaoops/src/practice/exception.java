package practice;

public class exception {
	
	public void method() {
		try {
		String str=null;
		}
		catch(NullPointerException e) {
		System.out.println(e);
		}
		System.out.println("Exceprtion Handled");
	}

	public static void main(String[] args) {
		
		exception exception=new exception();
		exception.method();

	}

}
