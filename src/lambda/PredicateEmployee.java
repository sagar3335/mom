package lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateEmployee {
	String eName;
	String desigantion;
	double salary;
	String city;

	public PredicateEmployee(String eName, String desigantion, double salary, String city) {
		super();
		this.eName = eName;
		this.desigantion = desigantion;
		this.salary = salary;
		this.city = city;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("(%s,%s,%.2f,%s)", eName, desigantion, salary, city);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<PredicateEmployee> list = new ArrayList<PredicateEmployee>();
		populate(list);
		Predicate<PredicateEmployee> p = emp -> emp.desigantion.equals("Manager");
//		display(p, list);
		Predicate<PredicateEmployee> p1 = emp -> emp.city.equals("Bangalore");
//		display(p1, list);
		Predicate<PredicateEmployee> p2 = emp -> emp.salary < 300;
//		display(p2, list);
		display(p.negate(), list);
	}

	public static void display(Predicate<PredicateEmployee> p, ArrayList<PredicateEmployee> list) {
		for (PredicateEmployee pemp : list) {
			if (p.test(pemp))
				System.out.println(pemp);
		}
	}

	public static void populate(ArrayList<PredicateEmployee> list) {

		list.add(new PredicateEmployee("sagar", "SDET", 100, "bbsr"));
		list.add(new PredicateEmployee("Suvankar", "Manager", 150, "Bangalore"));
		list.add(new PredicateEmployee("Senapoati", "aaa", 200, "India"));
		list.add(new PredicateEmployee("Sanatosh", "SDdET", 300, "pakistan"));
		list.add(new PredicateEmployee("Manas", "ddffff", 400, "India"));
	}

}
