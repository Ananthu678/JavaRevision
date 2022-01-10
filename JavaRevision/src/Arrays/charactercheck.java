package Arrays;

public class charactercheck {
	
	 public static boolean isNumber(char ch) 
	    {
		    if(ch>='0' && ch<='9') {
		    	return true;
		    }
		
			return false; 
		   
	       
	    } 
	 
	 public static String reverse(String str)
	 {
		 
		int n=str.length();
		char[] ch=str.toCharArray();
		int l=0, r=n-1;
		while(l<r) {
			
			if(!isNumber(ch[l])) {
				l++;
			}
			
			else if(!isNumber(ch[r])) {
				r--;
			}
			
		   else
		   {
			   char temp = ch[l];
			   ch[l]=ch[r];
			   ch[r]=temp;
			   l++;
			   r--;
		}
}
		
		String str2=new String(ch);
		return str2;
		 
	 }

	public static void main(String[] args) {


		String s="*1&2^3%4$5";
		System.out.println("After the reverse" + reverse(s));

	}

}
