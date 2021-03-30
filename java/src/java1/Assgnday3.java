package java1;

public class Assgnday3 {
	
	Assgnday3(){
		this(1,2,3,4);
		System.out.println("default cons");
	}
	Assgnday3(int a){
		this();
	    System.out.println("one parameter cons");
	}
	Assgnday3(int a,int b){
	   this(3,4,5);
		System.out.println("two parameters cons");
	}
	Assgnday3(int a,int b,int c){
        this(5);
		System.out.println("three parametres cons");
	}
	Assgnday3(int a,int b,int c,int d){
		
		System.out.println("four parameters cons");}
	 public static void main(String[] args) {
		Assgnday3 d = new Assgnday3(1,2);
	}

}