package Regex;

public class Eachwordreverse {

	public static void main(String[] args) {

		String input = "Baburao Ganpati Adkane";
		String output = "";
		System.out.println("The given string is :" + input);

		String[] spiltstring = input.split(" ");

		for (String string : spiltstring) {
			for (int i = string.length() - 1; i >= 0; i--) {
				output = output + string.charAt(i);
			}
		}
		System.out.println("The reverse of each word from a string is: " + output);
	}
}
