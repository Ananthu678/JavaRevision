package Arrays;

public class ReverseString {
	
	static void reverse(String s) {
		
		int n=s.length();
	
		int l=0, r=n-1;
		char[] ch=s.toCharArray();
		
		while(l<r) {
			
			
			char temp = ch[l];
		    ch[l]= ch[r];
			ch[r]=temp;
			l++;
			r--;
			
		}
		
		//String str2=new String(ch);
		System.out.println(ch);
		
	}

	public static void main(String[] args) {
		
		String str="geeks";
		reverse(str);

	}

}
