package dsa;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Student {
	int rollNo;
	String name;

	public Student() {

	}

	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}


	@Override
	public int hashCode() {
		return rollNo;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;

		if (obj instanceof Student) {
			Student std = (Student) obj;
			return (std.name.equals(this.name) && std.rollNo == rollNo);
		}
		return false;

	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}

	public static void main(String[] args) {
	
		Set<Student> set=new HashSet<Student>();
		set.add(new Student(10, "sagar"));
		set.add(new Student(12, "suvankar"));
		set.add(new Student(13," name"));
		set.add(new Student(14," name"));
		set.add(new Student(9," name"));
		set.add(new Student(100," name"));
		
		
		System.out.println(set);
		
		
		Student  student=new Student(10, "sagar");
		Student  student1=new Student(11, "sshhhsh");
		Student  student2=new Student(12, "sajkjkjjddgar");
		Student  student3=new Student(10, "sagar");
		System.out.println(student.equals(student3));
		System.out.println(student.hashCode()+" " +student3.hashCode());
						
		

	}

}
