package lambda;

public class Employee {
String name;
double  salary;
public Employee(String name, double salary) {
	super();
	this.name = name;
	this.salary = salary;
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+" : "+salary;
	}
}
