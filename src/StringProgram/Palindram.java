package StringProgram;

public class Palindram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindramBuildMethod(1121));
		System.out.println(isPalindramForloop("ss1dss"));
		System.out.println(isPalindramwhileloop("1234567871654321"));
		System.out.println(isPalindramWithoutUsinginBuildMethod(123454321));
		System.out.println(isPalindram("1234321"));
	}

	public static boolean isPalindramBuildMethod(Object obj) {
		return new StringBuilder(obj.toString()).reverse().toString().contains(obj.toString());
	}

	public static boolean isPalindramForloop(Object obj) {
		String string1 = obj.toString();
		StringBuilder sb = new StringBuilder();
		for (int i = string1.length() - 1; i >= 0; i--) {
			sb.append(string1.charAt(i));
		}
		return string1.equals(sb.toString());
	}

	public static boolean isPalindramwhileloop(Object obj) {
		String string1 = obj.toString();
		int length = string1.length() - 1;
		StringBuilder sb = new StringBuilder();
		while (length >= 0) {
			sb.append(string1.charAt(length));
			length--;
		}

		return string1.equals(sb.toString());
	}

	public static boolean isPalindramWithoutUsinginBuildMethod(int num) {
		int sum = 0, remainder, temp;
		temp = num;
		while (temp > 0) {
			remainder = temp % 10;
			temp = temp / 10;
			sum = sum * 10 + remainder;
		}

		return num == sum;
	}

	public static boolean isPalindram(Object obj) {
		String string = obj.toString();
		int len = string.length() - 1;
		for (int i = 0; i <=len/2; i++) {
			if (string.charAt(i) != string.charAt(len - i)) {
				return false;
			}
		}
		return true;
	}

}
