package Regex;

import java.util.Scanner;

import org.testng.annotations.Test;

public class General {
	@Test
	public void systemProperties() {

		System.getProperties().list(System.out); // To get the all system properties

		System.out.println("The name of operating system is :" + System.getProperty("os.name"));
		System.out.println("The name of user country is :" + System.getProperty("user.country"));
		System.out.println("The java version is: " + System.getProperty("java.version"));
		System.out.println("The name of user: " + System.getProperty("user.name"));

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the string to reverse: ");
		String string = scanner.nextLine();
		String reverse = "";
		for (int i = string.length() - 1; i >= 0; i--) {

			reverse = reverse + string.charAt(i);
		}
		System.out.println("The reverse string is :" + reverse);
	}

}
