package StringProgram;

public class StringProgram {

	public static void main(java.lang.String[] args) {
		String s = "amazon sagar senapati";
		System.out.println(s);
		System.out.println(reverseStringBuildMethod(s));
		System.out.println(reverseString(s));
		System.out.println(reverseStringWhileloop(s));
		System.out.println(reverseStringWord(s));
		System.out.println(reverseStringWordAndEachChar(s));
		System.out.println(reverseStringWordAndEachChara(s));
		

	}

	public static String reverseStringBuildMethod(String str) {
		return new StringBuilder(str).reverse().toString().trim();
	}

	public static String reverseString(String str) {
		StringBuilder sb = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		return sb.toString().trim();
	}

	public static String reverseStringWhileloop(String str) {
		StringBuilder sb = new StringBuilder();
		int length = str.length() - 1;
		while (length >= 0) {
			sb.append(str.charAt(length));
			length--;
		}
		return sb.toString().trim();
	}

	public static String reverseStringWord(String str) {
		String[] split = str.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = split.length - 1; i >= 0; i--) {
			sb.append(split[i]).append(" ");
		}
		return sb.toString().trim();
	}

	public static String reverseStringWordAndEachChar(String str) {
		String[] split = str.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = split.length - 1; i >= 0; i--) {
			for (int k = split[i].length() - 1; k >= 0; k--) {
				sb.append(split[i].charAt(k));
			}
			sb.append(" ");
		}
		return sb.toString().trim();
	}

	public static String reverseStringWordAndEachChara(String str) {
		String[] split = str.split(" ");
		StringBuilder sb = new StringBuilder();
		for (String string : split) {
			for (int k = string.length() - 1; k >= 0; k--) {
				sb.append(string.charAt(k));
			}
			sb.append(" ");
		}
		return sb.toString().trim();
	}

	
	
}
