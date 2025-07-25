package Assignment_one;

import java.util.Scanner;

class Concatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("enter the first name");
		String one = scan.nextLine();
		System.out.println("enter the last name");
		String two = scan.nextLine();
		System.out.println("hello, "+ one.concat(two)+"! Welcome to the system.");
scan.close();
	}

}
