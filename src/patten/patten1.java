package patten;

public class patten1 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		patten1_1.m1();

		patten1_2.m1();
		patten1_11.m1();
		patten1_3.m1();
		patten1_4.m1();
		patten1_5.m1();
		patten1_6.m1();
		patten1_7.m1();
		patten1_8.m1();
		patten1_9.m1();
		patten1_10.m1();

	}

}

class patten1_1 {

	public static void m1() {
		System.out.println("-------------patten1_1------------------");
		int z = 1;
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(z++);
			}
			System.out.println();
		}

	}

}

class patten1_2 {

	public static void m1() {
		System.out.println("-------------patten1_2------------------");
		for (int i = 1; i <= 5; i++) {
			int m = i;
			for (int j = 1; j <= i; j++) {
				System.out.print(m);
				m = m + 5 - j;
			}
			System.out.println();
		}

		/*
		 * for (int i = 1; i <= 5; i++) { int m = i; int k=4; for (int j = 1; j <= i;
		 * j++) { System.out.print(m); m=m+k; k--; } System.out.println(); }
		 */
	}

}

class patten1_3 {

	public static void m1() {
		System.out.println("-------------patten1_3------------------");
		for (int i = 1; i <= 5; i++) {
			int k = i;
			for (int j = 1; j <= i; j++) {
				System.out.print(k);
				k--;
			}
			System.out.println();
		}

	}

}

class patten1_4 {

	public static void m1() {
		System.out.println("-------------patten1_4------------------");

		for (int i = 1; i <= 5; i++) {
			int z = 1;
			for (int j = 1; j <= i; j++) {
				System.out.print(z++);
			}
			System.out.println();
		}

	}

}

class patten1_5 {

	public static void m1() {
		System.out.println("-------------patten1_5------------------");

		for (int i = 1; i <= 5; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

class patten1_6 {

	public static void m1() {
		System.out.println("-------------patten1_6------------------");

		for (int i = 1; i <= 5; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}
}

class patten1_7 {

	public static void m1() {
		System.out.println("-------------patten1_7-----------------");

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}

class patten1_11 {

	public static void m1() {
		System.out.println("-------------patten1_11-----------------");

		for (int i = 1; i <= 5; i++) {
			int k = 1;
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print(k);
				
				if (j >= i) {
					k--;
				} else {
					k++;
				}
				
			}
			System.out.println();
		}

	}
}

class patten1_8 {

	public static void m1() {
		System.out.println("-------------patten1_8-----------------");

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}
}

class patten1_9 {

	public static void m1() {
		System.out.println("-------------patten1_9-----------------");

		for (int i = 1; i <= 5; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}

class patten1_10 {

	public static void m1() {
		System.out.println("-------------patten1_10-----------------");

		for (int i = 1; i <= 5; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 4 * 2 - i; j >= i; j--) {
				System.out.print("*");
			}

			System.out.println();
		}

	}

}