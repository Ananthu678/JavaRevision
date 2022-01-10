package Arrays;

public class balancedString {
	
	  static void balString(String s) {
		  
		  int balancedcount=0;
		  int count=0;
		  for (int i = 0; i < s.length(); i++) {
			  if (s.charAt(i)=='L')
				  count ++;
			  else if (s.charAt(i)=='R')
				  count --;
			  
			  if(count==0)
				  balancedcount++;	  
		}
		  System.out.println(balancedcount);
	  }

	public static void main(String[] args) {
		
		String str ="RLRLRRLL";
		balString(str);
		

	}

}
