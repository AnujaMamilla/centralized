package java1;

public class Swap1 {

	public static void main(String[] args) {
		int a,b;
		a = 5;
		b = 7;
		System.out.println("Before swapping the value of a "+ a);
		System.out.println("before swapping the value of b "+ b);
		a = a+b;//12
		b = a-b;//5
		a = a-b;//7
		System.out.println("After swapping the value of a "+a);
		System.out.println("After swapping the value of b "+b);

	}

}
