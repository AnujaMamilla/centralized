package java1;

public class ReverseString {

	public static void main(String[] args) {
     String s = "My name is anuja";
      String result = " ";
      char[] a = s.toCharArray();
      for(int i=a.length-1;i>=0;i--) {
    	  
    	  result  =result+(a[i]);
      }

   System.out.println(result);
}
}
