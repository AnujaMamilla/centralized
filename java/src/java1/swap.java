package java1;

public class swap {

	public static void main(String[] args) {
		int a,b,c;
		a = 7;//7
		b = 8;//8
		System.out.println("before swapping value of a is "+a);
		System.out.println("before swapping value of b is "+b);
		c = a;//c=7,, a=7
		a = b;//a=8 , b=8 , c=7
		b = c;//a=8, b=7, c=7
		System.out.println("after swapping value of a is "+a);//8
		System.out.println("after swapping value of b is "+b);//7
	}

}
                                                 