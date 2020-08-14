package lambda;

import java.util.Date;
import java.util.function.Supplier;

public class RandomPwd {

	public static void main(String[] args) {
		Supplier<String> s = () -> {
			Supplier<Integer> d = () -> (int) (Math.random() * 10);
			String symbol = "ABCDEFGHIJKLMNOPQRSTUVWYZ@#$";
			Supplier<Character> c = () -> symbol.charAt((int) (Math.random() * 29));
			String pwd = "";
			for (int i = 0; i < 8; i++) {
				if (i % 2 != 0)
					pwd = pwd + d.get();
				else
					pwd = pwd + c.get();
			}
			return pwd;
		};	
	System.out.println(s.get());
	
	
	Supplier<Date> p=()->new Date();
	System.out.println(p.get());
	}

}
