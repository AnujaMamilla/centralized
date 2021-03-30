package java1;

public class Palindrome {

	public static void main(String[] args) {
		int number = 151;
		int sum = 0;
		int oldnumber = number;
		while(number>0) {
			int a = number%10;
			sum = (sum*10)+a;
			number = number/10;
		}
		
		if(oldnumber == sum)
			System.out.println("number is palindrome");
		else 
			System.out.println("number is not palindrome");
		}
}