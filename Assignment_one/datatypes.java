package Assignment_one;

import java.util.Scanner;

public class datatypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Age: ");
		int age = scan.nextInt();
		System.out.print("Height: ");
		float height = scan.nextFloat();
		System.out.print("Weight: ");
		float weight = scan.nextFloat();
		System.out.println("---------------");
		System.out.println("Age: "+age);
		System.out.println("Height: "+height);
		System.out.println("Weight: "+weight);
		
scan.close();
	}
}