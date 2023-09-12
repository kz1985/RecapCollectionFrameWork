package com.trics;

class Employee {
	int id;
	String name;
	double salary;
	public static String companyName = "JetBlue Airway corporatrion";

	Employee(int id, String name, double sal) {
		this.id = id;
		this.name = name;
		this.salary = sal;
	}

	void display() {
		System.out.println("Employee ID : " + id + "\nEmployee name: " + name + "\nSalary : " + salary
				+ "\nCompany Name : " + companyName);
	}
}

public class StaticKeyWord {
	private static final boolean Employee = false;

	public static void main(String[] args) {
		Employee emp1 = new Employee(101, "kashim", 12321);
		Employee emp2 = new Employee(105, "Sandul", 32154);
		Employee emp3 = new Employee(105, "Sonia", 188800);
		Employee emp4 = new Employee(254, "Vafa", 115000);
		Employee emp5 = new Employee(654, "Mohini", 32145);
		Employee emp6 = new Employee(785, "Angie", 220000);

		emp1.display();
		System.out.println();
		emp2.display();
		emp3.display();
		emp4.display();
		emp5.display();
		emp6.display();

	}

}
