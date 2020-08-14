package lambda;

import java.util.function.Function;

public class SqureRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] I = { 10, 20, 30, 2, 2627 };
		int[] I1 = { 10, 20, 30, 2, 2627 };
		Function<Integer, Boolean> f = i -> i % 2 == 0;
		for (int i : I) {
			System.out.println(f.apply(i));
		}
	}

}
