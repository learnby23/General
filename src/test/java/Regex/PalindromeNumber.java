package Regex;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int num=585;
		int rev=0;
		int temp=num;
		System.out.println("The given number is :"+num);
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println("The reverse number is :"+rev);
		if(temp==rev)
		{
			System.out.println("The given number is palindrome");
		}
		else
		{
			System.out.println("The given number is not palindrome");
		}
		
	}

}
