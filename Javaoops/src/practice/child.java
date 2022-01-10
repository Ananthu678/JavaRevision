package practice;

public class child extends Parent {

	int id; 
	  
    @Override
    void method() 
    { 
        System.out.println("Method from Child"); 
    } 
    
    void method2() 
    { 
        System.out.println("Method from Child2"); 
    } 
    
public static void main(String[] args) {
		
		Parent p = new child(); 
		
		        p.name = "GeeksforGeeks"; 
		   
		        System.out.println(p.name); 
		        p.method();
		        
		        
		        
				/*
				 * p.id = 1; System.out.println(p.id);
				 */

	}
}
