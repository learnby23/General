package Regex;

public class RemoveSymbol_and_Number {

	public static void main(String args[]) {
		
	String str="AB$B9@A";
	
	str=str.replaceAll("[^a-zA-Z]", "");  
	System.out.println("The symbol and number is removed:"+str); 

	}

}
