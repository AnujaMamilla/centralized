package java1;

import java.util.Scanner;
 public class Anuja
 {
	
	public int sum(int x1,int x2) {
	int a=x1+x2;
	return a;
	}
    public int sub(int x3,int x4) {
    	int b = x3-x4;
    	return b;
    }
    public int div(int x5,int x6) {
    	int c = x5/x6;
    	return c;
    }
    public void mul(int x7,int x8) {
    	int d = x7*x8;
    	System.out.println("result of ((((x1+x2)+x3)-x4)/x5)*x6)) is:" +d);
    }
public static void main(String[] args) {
	 Anuja a = new Anuja();
     Scanner s = new Scanner(System.in);
     System.out.println("enter the value of x1,x2,x3,x4,x5,x6");
     int x1=s.nextInt();
     int x2=s.nextInt();
     int x3=s.nextInt();
     int x4=s.nextInt();
     int x5=s.nextInt();
     int x6=s.nextInt();
     
     int result = a.sum(x1, x2);
     int result1 = a.sum(result,x3);
     int result2 = a.sub(result1, x4);
     int result3 = a.div(result2, x5);
      a.mul(result3, x6);
	}

}
