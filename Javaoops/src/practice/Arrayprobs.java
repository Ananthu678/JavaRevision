package practice;

public class Arrayprobs {

	public static void main(String[] args) {
		int a1[] = {1,2,3,4,5};
		int a2[] = {2,3,1,4,5}; //two arrays are equal
		
		for (int i = 0; i < a1.length; i++) {
			for (int j = 0; j < a2.length; j++) {
				if(a1[i]==a2[j]) 
					break;
				/*
				 * else System.out.println("not equal");
				 */
			}
			
		}
	}

}
