package Assignment_one;

import java.util.Scanner;

public class operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the 1st Number: ");
		int num1 = scan.nextInt();
		System.out.println("Enter the 2nd Number: ");
		int num2 = scan.nextInt();
		System.out.println("Addition: "+(num1+num2));
		int greater = (num1 > num2) ? num1 : num2;
		System.out.println("Greater number: "+greater);
		boolean positive = (num1>0)&&(num2>0);
		System.out.println("Are both positive? "+positive);
	scan.close();
	}

}
