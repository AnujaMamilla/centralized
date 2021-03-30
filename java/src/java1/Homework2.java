package java1;

public class Homework2 extends Homework1 {
	
	 public void book() {
		 this.book3(1,2,3);
		System.out.println("child default cons");
		}
	 public void book1(int a) {
		 this.book2(1,2);
		 System.out.println("child 1 parameter cons");
	 }
	 public void book2(int a,int b) {
		 this.book();
		 System.out.println("child 2 parameter cons");
	 }
	 public void book3(int a,int b,int c) {
		 super.work3(1,2,3);
		 System.out.println("child 3 parameter cons");
	 }
	 public void book4(int a,int b,int c,int d) {
		 this.book1(1);
		 System.out.println("child 4 parameter cons");
		 }
	 public static void main(String[] args) {
		 Homework2 w = new Homework2();
	     w.book4(1,2,3,4);
		
	}
         
         
         
}
