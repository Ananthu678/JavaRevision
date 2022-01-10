package LambdaExpressions;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Demo3 {
	

	public static void main(String[] args) {
		
          ArrayList<Integer> ar = new ArrayList<Integer>();
          
          for (int i = 0; i <=100; i+=5) {
			ar.add(i);
		}
          
          System.out.println(ar);
          
          Predicate<Integer> pr1=i->(i%2!=0);
          Predicate<Integer> pr2=i->(i>50);
          
          for(Integer n:ar) {
        	  if(pr1.test(n) && pr2.test(n)) {
        		  
        		  //pr1.and(pr2).test(n)
        		  //pr1.or(pr2).test(n)
        		  System.out.println(n);
        	  }
        	  
          }
          
          //negate
          
          for(Integer n1:ar) {
        	  if(pr1.negate().test(n1))
        	  {
        		  System.out.println(n1);
        	  }
          }
	} 

}
