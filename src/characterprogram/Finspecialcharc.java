package characterprogram;

public class Finspecialcharc {
public static void main(String[] args) {
	String str="#$%VSBSSNS&***";
	for (Character ch : str.toLowerCase().toCharArray()) {
		if(!Character.isLetterOrDigit(ch)) {
			System.out.println(ch);
}}
}
}
