package lambda;

import java.util.function.Supplier;

public class RandomInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supplier<String> s=()->{
			String[] s1= {"Sagar","Suvankar","sanatos","manash"};
			int x=(int)(Math.random()*4);
			return s1[x];
		};
	System.out.println(s.get());
	System.out.println(s.get());
	System.out.println(s.get());
	int random = (int)( Math.random()*4);
	System.out.println(random);

}}
