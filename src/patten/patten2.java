package patten;

public class patten2 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		patten2_1.m1();
		patten2_2.m1();
		patten2_3.m1();
		patten2_4.m1();
		patten2_5.m1();
		patten2_6.m1();

	}
}

class patten2_1 {

	public static void m1() {
		System.out.println("------------patten2_1-----------------------");
		for (int i = 1; i <= 5; i++) {
			for (int j = 2; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}

class patten2_6 {

	public static void m1() {
		System.out.println("------------patten2_6-----------------------");
		for (int i = 1; i <= 5; i++) {
			for (int j = 2; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}

class patten2_2 {

	public static void m1() {
		System.out.println("------------patten2_2-----------------------");
		for (int i = 1; i <= 5; i++) {
			for (int j = 2; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 5; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}
}

class patten2_3 {

	public static void m1() {
		System.out.println("------------patten2_3-----------------------");
		for (int i = 1; i <= 5; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 4; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}
}

class patten2_4 {

	public static void m1() {
		System.out.println("------------patten2_4-----------------------");

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 5; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = 1; i <= 4; i++) {
			for (int j = 3; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 5; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = 1; i <= 4; i++) {
			for (int j = 3; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

class patten2_5 {

	public static void m1() {
		System.out.println("------------patten2_5-----------------------");
		for (int i = 1; i <= 5; i++) {
			for (int j = 2; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 5 * 2 - i; j >= i; j--) {
				System.out.print("*");
			}

			System.out.println();
		}

	}
}
