package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArraylistLamada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> name = new ArrayList<Integer>();
name.add(10);
name.add(20);
name.add(100);
name.add(5);
System.out.println(name);
Collections.sort(name);
System.out.println(name);

Collections.sort(name,(I1,I2)->-I1.compareTo(I2));
System.out.println(name);

}}