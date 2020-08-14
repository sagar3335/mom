package string;

public class FindNumString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "12646646afhas35678363bnbc";
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(Character.isDigit(ch[i])) System.out.println(Character.getNumericValue(ch[i]));
 
		}
	}
}
