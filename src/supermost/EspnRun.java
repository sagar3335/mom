package supermost;

public class EspnRun  {

	public static void main(String[] args) {
		System.out.println(getSystemInformation());
	}
	 public static String getSystemInformation() {
		    return String.format("System info:os.name: '%s', os.arch: '%s', os.version: '%s', java.version: '%s', user.dir: '%s' ",
		        System.getProperty("os.arch"),
		        System.getProperty("os.version"),
		        System.getProperty("java.version"),
		        System.getProperty("java.version"),
		    System.getProperty("user.dir"));
		     
		    
		  }

}
