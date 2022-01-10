package practice;

public abstract class derivedclass extends testabstract {

	@Override
	public void display() {
		System.out.println("this is abstract class method");
		}
	
	public abstract void check();
	
	public derivedclass() {
		
	}
	
	
	public static void main(String args[]) {
		
		/*
		 * derivedclass obj = new derivedclass(); obj.display();
		 */
	}

}
