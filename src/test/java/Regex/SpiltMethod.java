package Regex;

import org.testng.annotations.Test;

public class SpiltMethod {

	@Test
	public void spiltmethod() {

		String input = "Selenium@Java@JUnit@Maven";
		String output = "";
		String[] str = input.split("@");

		for (String s : str) {

			for (int i = s.length() - 1; i >= 0; i--) {

				output = output + s.charAt(i);
			}

		}
		System.out.println("reverse is :" + output);
	}
}
