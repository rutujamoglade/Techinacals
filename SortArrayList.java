package ListInterface;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList list = new ArrayList();
		
		list.add(20);
		list.add(10);
		list.add(50);
		list.add(5);
		list.add(3);
		list.add(10);
		
		System.out.println("Before sortiing"+list);
		
		
		Collections.sort(list);
		//collection.sort() method is inbuilt method in collection.
		//and list is a chieldinterface of collection.
		//arraylist is chield class of list 
		// thats why we use this method
		
		System.out.println("After sortiing"+list);
		

	}

}
