package StringProgram;

public class FibonacciSeries {
	 static int n1 = 0, n2 = 1, n3 = 0;

	public static void main(String[] args) {
		printFibonacciSeriesWithoutrecuresion(10);
		System.out.println();
		printFibonacciSerieswhilellop(10);
		System.out.println();
		int n1 = 0, n2 = 1;
		System.out.print(n1 + "" + n2);
		printFibonacciSeriesUsingRecursion(10 - 2);
	}

	public static void printFibonacciSeriesWithoutrecuresion(int num) {
		int n1 = 0, n2 = 1, n3 = 0;
		System.out.print(n1 + "" + n2);

		for (int i = 2; i < 10; i++) {
			n3 = n1 + n2;
			System.out.print(n3);
			n1 = n2;
			n2 = n3;
		}
	}

	public static void printFibonacciSerieswhilellop(int num) {
		int n1 = 0, n2 = 1, n3 = 0;
		System.out.print(n1 + "" + n2);

		while (num - 2 > 0) {
			n3 = n1 + n2;
			System.out.print(n3);
			n1 = n2;
			n2 = n3;
			num--;
		}
	}

	public static void printFibonacciSeriesUsingRecursion(int num) {
		
		if (num > 0) {
//			System.out.println();
			n3 = n1 + n2;
			System.out.print(n3);
			n1 = n2;
			n2 = n3;
			printFibonacciSeriesUsingRecursion(num-1);

		}
	}

}
