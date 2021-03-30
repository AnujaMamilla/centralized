package java1;

public class Armstrong {

	public static void main(String[] args) {
		int number = 153;
		int sum = 0;
		int oldnumber = number;
			while(number>0) {
				int r = number%10;
				sum = sum+r*r*r;
				number = number/10;
			}
				if(oldnumber==sum) {
					System.out.println("number is armstrong");
				}	else {
						System.out.println("number is not armstrong");
				}
	}
}	

