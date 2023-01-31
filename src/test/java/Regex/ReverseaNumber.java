package Regex;

public class ReverseaNumber {

	public static void main(String[] args) {

		int num = 789;
		int rev = 0;
		System.out.println("The number before reverse is : " + num);
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("The number after reverse is : " + rev);

	}
}
