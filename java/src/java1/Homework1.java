package java1;

public class Homework1 {
	public void  work() {
		this.work2(1,2);
		System.out.println("Parent default method");
	}
	public void work1(int a) {
		this.work4(1,2,3,4);
		System.out.println("Parent 1 parameter cons");
	}
	public void work2(int a,int b) {
		System.out.println("parent 2 parameter cons");
	}
	public void work3(int a,int b,int c) {
		this.work1(1);
		System.out.println("parent 3 parameter cons");
		}
	public void work4(int a,int b,int c,int d) {
		this.work();
		System.out.println("parent 4 parameter cons");
	}

}
