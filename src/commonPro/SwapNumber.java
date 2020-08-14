package commonPro;

public class SwapNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = -20;
		System.out.println(String.format("Before Swaping Nunber X=%d , y=%d", x, y));
		x = x * y;
		y = x / y;
		x = x / y;
		System.out.println(String.format("After Swaping Nunber  X=%d , y=%d", x, y));
		
	}

}
