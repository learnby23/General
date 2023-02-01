package Regex;

public class containsNumber {

	public static void main(String[] args) {
		
		String string="Ra7Aa8Mm9$";
		System.out.println("The given string is :"+string);
		
		string=string.replaceAll("[^0-9]", "");
		System.out.println("The string contains only number :"+string);

	}

}
