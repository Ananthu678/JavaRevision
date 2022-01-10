package Arrays;

public class basics1 {

	public static void main(String[] args) {
		
		String str ="Ananthu @#!@# is a #4 very ! good boy ?/.";
		String str2=str.replaceAll("[^a-zA-Z0-9]", " ");
		
		String words[]=str2.split(" +");
		
		for(String s : words)
			System.out.println(s);
	}

}
