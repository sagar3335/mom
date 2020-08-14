package lambda;

import java.util.function.Supplier;

public class randomOTP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<String> s = () -> {
			String otp = "";
			for (int i = 0; i < 10; i++) {
				otp = otp + (int) (Math.random() * 10);
			}
			return otp;
		};
		
	System.out.println(s.get());
	System.out.println(s.get());
	System.out.println(s.get());
	System.out.println(s.get());
	System.out.println(s.get());
	System.out.println(s.get());
	
	int k= (int) (Math.random() * 10);
	System.out.println(k);
	}

}
