package Assignment_one;

public class Manager extends Employee{
String dept;

	public Manager(String name, double salary,String dept) {
		super(name, salary);
		this.dept = dept;
	}

	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		System.out.println("Department: " + dept);
		super.displayInfo();
	}
}
