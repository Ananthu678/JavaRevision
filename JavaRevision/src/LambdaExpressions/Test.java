package LambdaExpressions;

interface cab{
	public void bookcab(String source, String Destination);
}

interface cab1{
	public String bookcab(String source, String Destination);
}

public class Test {

	public static void main(String[] args) {
		
		cab cab=(source, Destination)-> System.out.println("source location is from" +  source +"to" + Destination);
        cab.bookcab("bangalore", "chennai");
        
        cab1 cab1=(source, Destination)-> { System.out.println("source location is from" + source +"to" + Destination);
        return("5000 price");};
        cab1.bookcab("bangalore", "chennai");
	}

}
