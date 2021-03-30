package java1;

public class Fibbo {

	public static void main(String[] args) {
		int a,b,c,i,count;
		a = 0;
		b = 1;
		count = 12;
		System.out.println(" "+a);
		System.out.println(" "+b);
	for(i=2;i<=count; ++i) {
		int sum =a+b;
		a = b;
		b = sum;
		System.out.println(" "+sum);
	}

	}

}
