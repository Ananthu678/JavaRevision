package practice;

public class Strings {

	public static void main(String[] args) {
		 
		String s1 = new String("abc");
		String s2 = new String("abc"); 
		String s6=s2.concat(" bcd");
		System.out.println(s6);
		System.out.println(s1 == s2); 
		System.out.println(s1.equals(s2));


		String s3 = "abc";
		String s4 = "abc";
		String s5=s3.concat(" bcd");
		System.out.println(s5);
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
		

	}

}
