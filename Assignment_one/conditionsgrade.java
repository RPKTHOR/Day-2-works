package Assignment_one;

import java.util.Scanner;
public class conditionsgrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your marks: ");
		int marks = scan.nextInt();
		char grade;
		if (marks >= 90){
			grade = 'A';
		} else if (marks >= 75){
			grade = 'B';
		} else if (marks >= 60){
			grade = 'C';
		} else if (marks >= 45){
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.println("grade: "+grade);
		scan.close();
	}
}
