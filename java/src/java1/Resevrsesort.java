package java1;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Resevrsesort {

	public static void main(String[] args) {

		List list = new ArrayList<>();
		list.add(30);
		list.add(50);
		list.add(5);
		list.add(100);
		Iterator i = list.iterator();
		System.out.println("Printing the List");
	while(i.hasNext()){
		System.out.println(i.next());
	}
		
	Comparator cmp = Collections.reverseOrder();
	Collections.sort(list,cmp);
	Iterator i2 = list.iterator();
	System.out.println("printing the desending ordetr");
while(i2.hasNext())
{
	System.out.println(i2.next());
}
	}

}
