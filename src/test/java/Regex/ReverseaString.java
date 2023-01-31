package Regex;

public class ReverseaString {

	public static void main(String[] args) {

		String input = "pleh";
		String output = "";
		System.out.println("The given input string is :" + input);

		for (int i = input.length() - 1; i >= 0; i--) {
			output = output + input.charAt(i);
		}
		System.out.println("The reverse string is :" + output);

	}

}
