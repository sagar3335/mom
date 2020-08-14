package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> l=new ArrayList<String>();
l.add("sagar");
l.add("suvankar");
l.add("sanatosh");
System.out.println(l);

List<String> l1=l.stream().filter(s->s.length()>=6).collect(Collectors.toList());
System.out.println(l1);
List<String> l2=l.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
System.out.println(l2);
long l3=l.stream().filter(s->s.length()>=6).count();
System.out.println(l3);
		
		
	}

}
