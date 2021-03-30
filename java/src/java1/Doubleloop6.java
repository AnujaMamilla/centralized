package java1;

public class Doubleloop6 {

	public static void main(String[] args) {
		int value = 1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<i+1;j++) {
				System.out.print(value++ +" ");
				}
			System.out.println();
			
		}
	}
}
