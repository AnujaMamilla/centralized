package java1;
class studentt{
	 public int sum(int x1,int x2) {
		 int x3 = x1+x2;
	System.out.println("sum of result is : "+ x3);
		 return x3;}
     public int sub(int x3,int x4) {
	     int c = x3-x4;
	System.out.println("subtraction of result is : " +c);
	     return c;}
	 public int mul(int x5,int x6) {
		int d = x5*x6;
	System.out.println("multiplication of result id : " +d);
		return d;}
	 public int div(int x7,int x8) {
		 int e = x7/x8;
	System.out.println("div of reslut is : " +e);
		 return e;}
	}
class Student2{
	public int div(int a,int b) {
		int c = a/b;
	System.out.println("div = " +c);
	    return c;}
    public int sum(int d,int e) {
    	int f = d+e;
    System.out.println("sum = " +f);
        return f;}
    public int sub(int g,int h ) {
    	int i = g-h;
    System.out.println("sub = " +i);
       return i;
    }
}
public class Assign1 {

	public static void main(String[] args) {
    studentt s1 = new studentt();
     int value = s1.sum(10,2);
     int value1 = s1.sub(value,2);
     int value2 = s1.sum(value1,2);
     int value3 = s1.mul(value2, 2);
     int value4 = s1.div(value3, 2);
     System.out.println("final result is "  +value4);
       Student2 s2 = new Student2();
       int result = s2.div(10,2);
       int result1 = s2.sum(result,2);
       int result2 = s2.sub(result1,2);
       int result3 = s2.sum(result2,2);
       int result4 = s2.sum(result3,2);
     System.out.println("final result is " + result4);
       
     
     
	}

}
