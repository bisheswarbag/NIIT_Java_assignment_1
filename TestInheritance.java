package assignment_1;

class Employee {
	// Employee class with 3 fields
	String name;
	double salary;
	String eid;
					
	// Employee class with one constructor
	public Employee(String n, double sal, String id) {																																																																																																				
		name = n;
		salary = sal;
		eid = id;
	}

	// setters and getters methods
	public void setName(String n) {
		name = n;
	}

	public String display() {
		return "Name: " + name + "\nSalary: " + salary + "\nEmployee Id: " + eid;
	}

}

class Manager extends Employee {
	// Manager with its own field
	String department;

	// Manager with constructors
	public Manager(String d, String n, double sal, String id) {
		super(n, sal, id);//formal parameter_ // invoking and passing the value to the parent
							// constructor
		department = d;
	}

	// Methods to display the details of the manager
	public String display() {
		return super.display() + "\nDepartment: " + department;
	}
}

public class TestInheritance {
	public static void main(String[] ar) {
		System.out.println("------EMPLOYEE CLASS-------------");
		Employee e = new Employee("MK", 45000.00, "31763");

		System.out.println(e.display());
		e.setName("AK");
		System.out.println(e.display());
		System.out.println("------MANAGER CLASS------------");
		Manager m = new Manager("HR", "SK", 45000.00, "31763");
		System.out.println(m.display());
		System.out.println("----IMPLICIT CASTING---------------");
		Employee emp = new Manager("HR", "RK", 45000.00, "31763");
		System.out.println(emp.display());
		System.out.println("----EXPLICIT CASTING---------------");

		if (emp instanceof Manager) {
			Manager ma = (Manager) emp;
			System.out.println(ma.display());
		} else {
			System.out.println("Wont Display");
		}

	}

}
