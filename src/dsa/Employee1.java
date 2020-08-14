package dsa;

public class Employee1 {
	Integer eID;
	String eName;

	public Employee1(Integer eID, String eName) {
		super();
		this.eID = eID;
		this.eName = eName;
	}

	public Employee1() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee1 [eID=" + eID + ", eName=" + eName + "]";
	}

}
