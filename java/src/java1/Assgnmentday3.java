package java1;

public class Assgnmentday3 {
	public void parameter() {
		//this.parameter3(1,2,3);
		//this.parameter2(1,2);
		//parameter4(1,2,3,4);
		//parameter();
		System.out.println("default called");
	}
    public void parameter1(int a) {
    	this.parameter2(1,2);
    	//parameter2(3, 4);
		System.out.println("one parameter method");
	}
    public void parameter2(int a,int b) {
    	parameter4(1,2,3,4);
    	System.out.println("two parameters method");
    }
    public void parameter3(int a,int b,int c) {
    	System.out.println("three parameters method");
    }
    public void parameter4(int a,int b,int c,int d) {
    	parameter();
    	System.out.println("four parameters method");
    }
	public static void main(String[] args) {
		Assgnmentday3 e = new Assgnmentday3();
		e.parameter1(1);
		
	}

}
