package lambda;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> list = new ArrayList<Employee>();
		populate(list);
		System.out.println("Before incremant" + list);
		Predicate<Employee> p = e -> e.salary < 3500;
		Function<Employee, Employee> f = e -> {
			e.salary=e.salary+375;
			return e;
		};
		
		for (Employee employee : list) {
			if (p.test(employee)) {
				f.apply(employee);
				
			}
		}

		System.out.println("Total Employee salary" +list);
	}

	public static void populate(ArrayList<Employee> list) {
		list.add(new Employee("Sagar", 1000));
		list.add(new Employee("Suvanakr", 2000));
		list.add(new Employee("Senapati", 3000));
		list.add(new Employee("suva", 4000));
		list.add(new Employee("Super", 10000));

	}

}
