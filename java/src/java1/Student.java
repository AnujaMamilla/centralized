package java1;
public class Student{
	int age;
	int roll_no;
public void d1() {
	System.out.println("welcome all");
}
public void d2() {
	System.out.println("Automation is easy");
}

public static void main(String[] args) {
	
		Student s = new Student();
	    s.age = 14;
		s.roll_no = 1;
		System.out.println("age is"+s.age);
		System.out.println("roll no is"+s.roll_no);
		s.d1();
		s.d2();
 }
}
