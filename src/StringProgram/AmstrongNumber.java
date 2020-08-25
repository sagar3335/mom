package StringProgram;

public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isArmstrong(153));
	}

	public static boolean isArmstrong(int num) {
		int sum = 0;
		int temp = num;
		while (temp > 0) {
			int reminder = temp % 10;
			temp = temp / 10;
			sum = sum + reminder * reminder * reminder;
		}
		return sum == num;
	}

}
