package Regex;

public class PalindromeString {

	public static void main(String[] args) {
		String input = "abbaa";
		String output = "";
		System.out.println("The given input string is :" + input);

		for (int i = input.length() - 1; i >= 0; i--) {
			output = output + input.charAt(i);
		}
		System.out.println("The reverse string is :" + output);

		if (input.equals(output)) {
			System.out.println("The given string is palindrome");
		} else {
			System.out.println("The given string is not palindrome");
		}
	}

}
