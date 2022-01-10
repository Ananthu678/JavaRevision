package practice;

public class interfaceclass implements classA,classB,classC {

	public static void main(String[] args) {
		interfaceclass ic=new interfaceclass();
		ic.displayA();
		ic.displayB();
		System.out.println(ic.s);

}

	@Override
	public void displayB() {
		System.out.println("displayB method");
		
	}

	@Override
	public void displayA() {
		System.out.println("displayA method");
		
	}
	
	@Override
	public void displayC() {
		System.out.println("displayC method");
	}

}
