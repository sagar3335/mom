package dsa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add(13);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list, (Object o1, Object o2) -> {
			Integer I1 = (Integer) o1;
			Integer I2 = (Integer) 02;
			return I2.compareTo(I1); 
		});
		System.out.println(list);
	}
}
