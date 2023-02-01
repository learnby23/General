package Regex;

public class ExtractNumber {

	public static void main(String agrs[]) {
		String string = "A7B8C9%";
		String output = "";
		System.out.println("The given string is: " + string);

		for (int i = 0; i <= string.length() - 1; i++) {

			if (Character.isDigit(string.charAt(i))) {
				output = output + string.charAt(i);
			}
		}
		System.out.println("The extracted number is: " + output);
	}
}
