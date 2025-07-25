package Assignment_one;

public class Student {
	
	private String name;
	private float mark;
	
	public Student(String name, float mark) {
		this.name = name;
		this.mark = mark;
	}
	public void displayInfo() {
		System.out.println("Student name: "+ name);
		System.out.println("Student mark: "+mark);
	}
}
