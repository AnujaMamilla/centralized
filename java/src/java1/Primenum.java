package java1;

class Primenum {
	public static void main(String[] args) {
		int num = 38;
		int count = 0;
		for (int i = 1; i <= num / 2; i++) {

			if (num % i == 0) {
				count++;
			}
		}
		if (count == 1) {
			System.out.println("number is prime");
		} else {
			System.out.println("number is not a prime number");
		}
	}

}
