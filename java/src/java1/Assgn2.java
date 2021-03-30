package java1;
class Student1{
	int div(int a,int b) {
		int c = a/b;
		System.out.println("div is"+c);
		return c;
	}
	int sum(int d,int e) {
		int f = d+e;
		System.out.println("sum is "+ f);
		return f;
	}
	int sub(int g,int h) {
		int i = g-h;
		System.out.println("sub is "+ i);
		return i;
	}
}
public class Assgn2 {

	public static void main(String[] args) {
		Student1 s2 = new Student1();
        int result = s2.div(10,2);
        int result1 = s2.sum(result, 2);
        int result2 = s2.sub(result1,2);
        int result3 = s2.sum(result2, 2);
        int result4 = s2.sum(result3, 2);
        System.out.println("final result is " + result4);
	}

}
