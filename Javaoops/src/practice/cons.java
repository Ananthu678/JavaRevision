package practice;

public class cons {
	
	/*
	 * String name="Ananthu"; int id=1;
	 * 
	 * String name1="karunya"; int id1=2;
	 * 
	 * String name2="Athibar"; int id2=3;
	 */
	
	String name;
	int id;
	
	
	  public cons(String name, int id) {
	  
	  this.name=name; 
	  this.id=id;
	  
	  }
	 
	
	public void method() {
		
		System.out.println(id);
		System.out.println(name);
	}
	
	public void add() {
		
		int a=1; int b=2;
		int c=a+b;
		System.out.println(c);
	}
	
   public void add2() {
		
		int a=1; int b=2;
		int c=a+b;
		System.out.println(c);
	}
	
	
	public void add(int a, int b) {
		a=1; b=2;
		int c=a+b;
		System.out.println(c);
	}

	public void add(String a, int b, int c) {
		/*
		 * a=1; b="21"; c= a + b;
		 */
		System.out.println( a + b + c);
	}

	public static void main(String[] args) {

       cons c =new cons("Ananthu",1);
       cons c1=new cons("karunya",2);
       cons c2=new cons("Athibar",3);
       c.method();
       c1.method();
       c2.method();
       c.add("1", 21, 2);
       
		/*
		 * System.out.println(c.name); System.out.println(c.name1);
		 * System.out.println(c.id1); System.out.println(c.name2);
		 */
       

	}

	
	// abstraction - abstract method and class
	// inheritance - method overriding using object which referred to the parent class
	// constructor - default and parametrized
	// overloading - method with same name but with different parameter
	// basic concatenation of integer and string
}
