package Assignment_one;

public class Employee {
	String name;
	double salary;
	
	public Employee(String name,double salary) {
		this.name = name;
		this.salary = salary;
	}
	public void displayInfo() {
		System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        
	}

}
