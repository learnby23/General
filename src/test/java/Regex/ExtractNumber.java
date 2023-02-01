package Regex;

public class ExtractNumber {

	public static void main(String agrs[]) {
		String str = "A7B8C9%";
		String output = "";
		System.out.println("The given string is: " + str);

		for (int i = 0; i <= str.length() - 1; i++) {

			if (Character.isDigit(str.charAt(i))) {
				output = output + str.charAt(i);
			}
		}
		System.out.println("The extracted number is: " + output);
	}
}
