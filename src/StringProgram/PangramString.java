package StringProgram;

public class PangramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkPangram("abcdefghijklmnopqrstuvwxyz");
		System.out.println(checkPangrama("abcdefGhijKlmnopqrstuvwxyz"));
	}
	public static void checkPangram(String str) {
		boolean allStringPresent = true;
		for (char c = 'a'; c <= 'z'; c++) {
			if (!str.toLowerCase().contains(String.valueOf(c))) {
				allStringPresent = false;
				break;
			}
		}
		String s = (allStringPresent == true) ?str + "  is palangram" : str + " is not palangram";
		System.out.println(s);
	}
	public static boolean checkPangrama(String str) {
		for (char c = 'a'; c <= 'z'; c++) {
			if (!str.toLowerCase().contains(String.valueOf(c))) {
				return false;
			}
		}
		return true;
	}

}
