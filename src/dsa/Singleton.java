package dsa;

public class Singleton {
	public static void name() {
		System.out.println(stn);
	}
	
	private static Singleton stn=null;
static {
	System.out.println(stn);
}
	private Singleton() {
	}
	public static Singleton getSingleTon() {
		// TODO Auto-generated method stub
		if(stn==null) stn=new Singleton();
		return stn;
	}
	public static void main(String[] args) {
		Singleton singleTon = Singleton.getSingleTon();
		System.out.println(singleTon.hashCode());
		singleTon.name();
}
}
