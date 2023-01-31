package Regex;

public class ContainsLetter {

	public static void main(String args[]) {
		
	String str="Abd@$s9cd@vjd";
	
	str=str.replaceAll("[^a-zA-Z]", "");  
	System.out.println(str); 
	

	}

}
