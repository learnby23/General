package Regex;

public class containsUpperCaseLetter {

	public static void main(String[] args) {
		
		String string="RaAaMm";
		System.out.println("The given string is :"+string);
		
		string=string.replaceAll("[^A-Z]", "");
		System.out.println("The string contains only uppercase letter :"+string);
	}

}
