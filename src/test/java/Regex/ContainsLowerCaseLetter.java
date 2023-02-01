package Regex;

public class ContainsLowerCaseLetter {

	public static void main(String[] args) {
		
		String string="RrAaMm";
		System.out.println("The given string is: "+string);
		
		string=string.replaceAll("[^a-z]", "");
		
		System.out.println("The string contains small letter is :"+string);
	}

}
