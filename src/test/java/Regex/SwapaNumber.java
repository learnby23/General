package Regex;

public class SwapaNumber {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		System.out.println("The number before swapping as a: " + a + " and b: " + b);

		// int temp = a; a = b; b = temp; 	//Logic 1

		// a = a + b; b = a - b; a = a - b; //Logic 2

		// a = a * b; b = a / b; a = a / b; //Logic 3

		// a = a ^ b; b = a ^ b; a = a ^ b; //Logic 4

		b = a + b - (a = b); 				// Logic 5

		System.out.println("The number after swapping as a: " + a + " and b: " + b);

	}

}
