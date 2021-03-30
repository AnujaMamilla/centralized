package java1;

public class Homework extends Assgnday4
{
	public Homework() {
        super(1,2,3,4);
		System.out.println("child default cons");
	}
	public Homework(int a) {
		this(1,2,3);
		System.out.println("child 1 parameter cons");
	}
	public Homework(int a,int b) {
		this(1,2,3,4);
		System.out.println("child 2 parameter cons");
	}
	public Homework(int a,int b,int c) {
		this(1,2);
		System.out.println("child 3 parameter cons");
	}
	public Homework(int a,int b,int c,int d) {
		this();
		System.out.println("child 4 parameter cons");
	}

public static void main(String[]args) {
	Homework h = new Homework(1);

}
}
