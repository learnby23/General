package Regex;

public class Substring {

	public static void main(String[] args) {

		String input = "Baburao";
		System.out.println("The given string is: " + input);

		input = input.substring(1);
		System.out.println("The substring is :" + input);
		
		String input1="Baburao";
		input1 = input1.substring(1, 5);
		System.out.println("The substring using first and lastindex is :" + input1);

	}

}
