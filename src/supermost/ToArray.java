package supermost;

import java.util.ArrayList;
import java.util.Arrays;

public class ToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
ArrayList<String> name = new ArrayList<String>();
name.add("suvankar");
name.add("sagar");
name.add("ramesH");

System.out.println(name);
String[] array = name.toArray(new String[name.size()]);
System.out.println(Arrays.toString(array));
}
}
