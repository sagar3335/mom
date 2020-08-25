package StringProgram;

public class CountTotalNumberOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="java is ver simple";
int totalLength = str.length();
int totalLengthChar = str.replace(" ", "").length();
int totalSpace=totalLength-totalLengthChar;
System.out.println(totalLength +" :"+totalLengthChar +" :"+totalSpace);
	}

}
