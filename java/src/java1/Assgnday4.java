package java1;

public class Assgnday4 {
	public Assgnday4() {
		this(1,2,3);
		System.out.println("parent default cons");
	}
	public Assgnday4(int a) {
        this();
		System.out.println("parent 1 parameter cons");
	}
	public Assgnday4(int a,int b) {
	    this(1);
		System.out.println("parent 2 parameters cons");
	}
	public Assgnday4(int a,int b,int c) {
		System.out.println("parent 3 parameters cons");
	}
	public Assgnday4(int a,int b,int c,int d) {
		this(1,2);
		System.out.println("parent 4 parameters cons");
	}
}
