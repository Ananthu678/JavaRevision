package practice;

public class finalclass extends derivedclass {
	
	
	public static void main(String[] args) {
		finalclass finall = new finalclass();
		finall.check();
		finall.display();
		finall.finalmethod();

	}

	@Override
	public void check() {
		System.out.println("finalclass method");
		
	}

}
