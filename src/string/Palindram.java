package string;

public class Palindram {
	public static String checkPalindram(Object obj) {
		if (obj == null)
			throw new NullPointerException();
		return new StringBuilder(obj.toString()).reverse().toString();
	}
	public static String checkpalinString(Object s) {
		String str = s.toString();
		StringBuilder sb = new StringBuilder();

		for (int i = 1; i <= str.length(); i++) {
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkPalindram("ddfdddf"));
		System.out.println(checkPalindram("chjjjcjj"));
	}
}
