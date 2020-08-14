package dsa;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Employee implements Comparable<Employee> {
	String eName;
	Integer eId;

	public Employee(String eName, Integer eId) {
		super();
		this.eName = eName;
		this.eId = eId;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}
public static void main(String[] args) {
	Employee name = new Employee("sagar",10);
	Employee name1 = new Employee("suvankar",11);
	Employee name2 = new Employee("santosh",12);
	Employee name3 = new Employee("laxman",20);
	Employee name4 = new Employee("manas",13);
	
	Set<Employee> set=new TreeSet<Employee>();
	set.add(name);
	set.add(name1);
	set.add(name2);
	set.add(name3);
	set.add(name4);
	
	System.out.println(set);
	
	System.out.println("--------------------------------------");
	Set set1=new TreeSet(new Comparator() {

		@Override
		public int compare(Object o1, Object o2) {
			// TODO Auto-generated method stub
			String string1 = o1.toString();
			String string2 = o2.toString();
			return -string1.compareTo(string2);
		}
		
	});
			set1.add(new StringBuffer("sagar"));
			set1.add(new StringBuffer("Suvanakar"));
			set1.add(new StringBuffer("Sanatosh"));
		
			System.out.println(set1);
			
			
			StringBuffer stringBuffer = new StringBuffer("sagar");
			System.out.println(stringBuffer.toString());
}

@Override
public String toString() {
	return "Employee [ "+ eName +"--- " +eId + " ]";
}

@Override
public int compareTo(Employee emp) {
	// TODO Auto-generated method stub
//	return eName.compareTo(emp.eName);
	return  -eId.compareTo(emp.eId);
//	return - ((eId<emp.eId)?-1:(eId==emp.eId)?0:1);
}
}
