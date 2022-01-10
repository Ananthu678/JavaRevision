package codingproblems;

public class PlusOne {
	
	public void plusone(int[] digits) {
		
		int n=digits.length;
		for (int i = n-1; i>0; i--) {
			
			if(digits[i]<9) {
				digits[i]++;
			      break;
		}
			digits[i]=0;
			}
		
		
		
	}

	public static void main(String[] args) {
		 
		int digits[]= new int[3];
		digits[0]=1;
		digits[1]=2;
		digits[2]=9;
		PlusOne plus =new PlusOne();
		plus.plusone(digits);
		
		for (int i = 0; i < digits.length; i++) {
			System.out.println(digits[i]);
		}

	}

}
