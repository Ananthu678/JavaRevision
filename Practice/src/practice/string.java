package practice;

public class string {

	public static void main(String[] args) {

		/*
		 * String s1 = new String("abc"); String s2 = new String("abc");
		 * System.out.println(s1 == s2); System.out.println(s1.equals(s2));
		 */
		
		String s1 = "abc";
		String s2 = "abc";
		s2 ="bcd";
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		String s="Sachin";  
		   s.concat(" Tendulkar");
		   System.out.println(s);

	}

}
